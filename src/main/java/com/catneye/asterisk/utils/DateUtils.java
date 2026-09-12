/*
 * jasterNG - Java interface for Asterisk
 *
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG.
 *
 * jasterNG is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, version 2.
 *
 * jasterNG is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasterNG. If not, see <https://www.gnu.org/licenses/>.
 *
 * Modified by Kurchenko O.E. 2026-09-12.
 */

package com.catneye.asterisk.utils;

import com.catneye.asterisk.Exception.WrongDateException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {

    /**
     * Calls {@link #asLocalDate(Date, ZoneId)} with the system default time
     * zone.
     *
     * @param date is java.util.Date
     * @return in LocalDate
     */
    public static LocalDate asLocalDate(java.util.Date date) {
        return asLocalDate(date, ZoneId.systemDefault());
    }

    /**
     * Creates {@link LocalDate} from {@code java.util.Date} or it's
     * subclasses.Null-safe.
     *
     * @param date
     * @param zone
     * @return
     */
    public static LocalDate asLocalDate(java.util.Date date, ZoneId zone) {
        if (date == null) {
            return null;
        }

        if (date instanceof java.sql.Date) {
            return ((java.sql.Date) date).toLocalDate();
        } else {
            return Instant.ofEpochMilli(date.getTime()).atZone(zone).toLocalDate();
        }
    }

    /**
     * Calls {@link #asLocalDateTime(Date, ZoneId)} with the system default time
     * zone.
     *
     * @param date
     * @return
     */
    public static LocalDateTime asLocalDateTime(java.util.Date date) {
        return asLocalDateTime(date, ZoneId.systemDefault());
    }

    /**
     * Creates {@link LocalDateTime} from {@code java.util.Date} or it's
     * subclasses.Null-safe.
     *
     * @param date
     * @param zone
     * @return
     */
    public static LocalDateTime asLocalDateTime(java.util.Date date, ZoneId zone) {
        if (date == null) {
            return null;
        }

        if (date instanceof java.sql.Timestamp) {
            return ((java.sql.Timestamp) date).toLocalDateTime();
        } else {
            return Instant.ofEpochMilli(date.getTime()).atZone(zone).toLocalDateTime();
        }
    }

    /**
     * Calls {@link #asUtilDate(Object, ZoneId)} with the system default time
     * zone.
     *
     * @param date
     * @return
     */
    public static java.util.Date asUtilDate(Object date) {
        return asUtilDate(date, ZoneId.systemDefault());
    }

    /**
     * Creates a {@link java.util.Date} from various date objects.Is null-safe.
     * Currently supports:<ul>
     * <li>{@link java.util.Date}
     * <li>{@link java.sql.Date}
     * <li>{@link java.sql.Timestamp}
     * <li>{@link java.time.LocalDate}
     * <li>{@link java.time.LocalDateTime}
     * <li>{@link java.time.ZonedDateTime}
     * <li>{@link java.time.Instant}
     * </ul>
     *
     * @param date
     * @param zone Time zone, used only if the input object is LocalDate or
     * LocalDateTime.
     *
     * @return {@link java.util.Date} (exactly this class, not a subclass, such
     * as java.sql.Date)
     */
    public static java.util.Date asUtilDate(Object date, ZoneId zone) {
        if (date == null) {
            return null;
        }

        if (date instanceof java.sql.Date || date instanceof java.sql.Timestamp) {
            return new java.util.Date(((java.util.Date) date).getTime());
        }
        if (date instanceof java.util.Date) {
            return (java.util.Date) date;
        }
        if (date instanceof LocalDate) {
            return java.util.Date.from(((LocalDate) date).atStartOfDay(zone).toInstant());
        }
        if (date instanceof LocalDateTime) {
            return java.util.Date.from(((LocalDateTime) date).atZone(zone).toInstant());
        }
        if (date instanceof ZonedDateTime) {
            return java.util.Date.from(((ZonedDateTime) date).toInstant());
        }
        if (date instanceof Instant) {
            return java.util.Date.from((Instant) date);
        }
        if (date instanceof XMLGregorianCalendar) {
            return java.util.Date.from(((XMLGregorianCalendar) date).toGregorianCalendar().toInstant());
        }

        throw new UnsupportedOperationException("Don't know hot to convert " + date.getClass().getName() + " to java.util.Date");
    }

    /**
     * Creates an {@link Instant} from {@code java.util.Date} or it's
     * subclasses.Null-safe.
     *
     * @param date
     * @return
     */
    public static Instant asInstant(Date date) {
        if (date == null) {
            return null;
        } else {
            return Instant.ofEpochMilli(date.getTime());
        }
    }

    /**
     * Calls {@link #asZonedDateTime(Date, ZoneId)} with the system default time
     * zone.
     *
     * @param date
     * @return
     */
    public static ZonedDateTime asZonedDateTime(Date date) {
        return asZonedDateTime(date, ZoneId.systemDefault());
    }

    /**
     * Creates {@link ZonedDateTime} from {@code java.util.Date} or it's
     * subclasses.Null-safe.
     *
     * @param date
     * @param zone
     * @return
     */
    public static ZonedDateTime asZonedDateTime(Date date, ZoneId zone) {
        if (date == null) {
            return null;
        } else {
            return asInstant(date).atZone(zone);
        }
    }

    /**
     * Calls {@link #asUtilDate(Object, ZoneId)} with the system default time
     * zone.
     *
     * @param date
     * @return
     */
    public static java.util.GregorianCalendar asUtilGregorianCalendar(Object date) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(asUtilDate(date, ZoneId.systemDefault()));
        return gc;
    }

    /**
     * Converts a java.util.Date into an instance of XMLGregorianCalendar
     *
     * @param date Instance of java.util.Date or a null reference
     * @return XMLGregorianCalendar instance whose value is based upon the value
     * in the date parameter. If the date parameter is null then this method
     * will simply return null.
     */
    public static XMLGregorianCalendar asXMLGregorianCalendar(java.util.Date date) {
        if (date == null) {
            return null;
        } else {
            try {
                DatatypeFactory df = DatatypeFactory.newInstance();
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTimeInMillis(date.getTime());
                return df.newXMLGregorianCalendar(gc);
            } catch (DatatypeConfigurationException dce) {
                throw new IllegalStateException("Exception while obtaining DatatypeFactory instance", dce);
            }
        }
    }

    /**
     * Calls {@link #asUtilDate(Object, ZoneId)} with the system default time
     * zone.
     *
     * @param date
     * @return
     */
    public static XMLGregorianCalendar asXMLGregorianCalendar(Object date) {

        return asXMLGregorianCalendar(asUtilDate(date, ZoneId.systemDefault()));
    }

    /**
     * Check dateformat string
     *
     * @param dateString
     * @return String for SimpleDateFormat
     */
    public static String determineDate(String dateString) {
        Map<String, String> DATE_FORMAT_REGEXPS = new HashMap<String, String>() {
            {
                put("^\\d{8}$", "yyyyMMdd");
                put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy");
                put("^\\d{1,2}.\\d{1,2}.\\d{4}$", "dd.MM.yyyy");//29.09.2019
                put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
                put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
                put("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
                put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
                put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
                put("^\\d{1,2}\\.\\d{1,2}\\.\\d{4}$", "dd.MM.yyyy");
                put("^\\d{4}\\.\\d{1,2}\\.\\d{1,2}$", "yyyy.MM.dd");
                put("^\\d{1,2}\\.\\d{4}$", "MM.yyyy");//07.1980
                put("^\\d{4}$", "yyyy");//1980
                put("^\\d{12}$", "yyyyMMddHHmm");
                put("^\\d{8}\\s\\d{4}$", "yyyyMMdd HHmm");
                put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}$", "dd-MM-yyyy HH:mm");
                put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy-MM-dd HH:mm");
                put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}$", "MM/dd/yyyy HH:mm");
                put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy/MM/dd HH:mm");
                put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMM yyyy HH:mm");
                put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}$", "dd MMMM yyyy HH:mm");
                put("^\\d{1,2}\\.\\d{1,2}\\.\\d{4}\\s\\d{1,2}:\\d{2}$", "dd.MM.yyyy HH:mm");
                put("^\\d{4}\\.\\d{1,2}\\.\\d{1,2}\\s\\d{1,2}:\\d{2}$", "yyyy.MM.dd HH:mm");
                put("^\\d{14}$", "yyyyMMddHHmmss");
                put("^\\d{8}\\s\\d{6}$", "yyyyMMdd HHmmss");
                put("^\\d{1,2}-\\d{1,2}-\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd-MM-yyyy HH:mm:ss");
                put("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd HH:mm:ss");
                put("^\\d{1,2}/\\d{1,2}/\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "MM/dd/yyyy HH:mm:ss");
                put("^\\d{4}/\\d{1,2}/\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy/MM/dd HH:mm:ss");
                put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMM yyyy HH:mm:ss");
                put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd MMMM yyyy HH:mm:ss");
                put("^\\d{1,2}\\.\\d{1,2}\\.\\d{4}\\s\\d{1,2}:\\d{2}:\\d{2}$", "dd.MM.yyyy HH:mm:ss");
                put("^\\d{4}\\.\\d{1,2}\\.\\d{1,2}\\s\\d{1,2}:\\d{2}:\\d{2}$", "yyyy.MM.dd HH:mm:ss");
                put("^\\d{1,2}:\\d{1,2}:\\d{1,2}$", "HH:mm:ss");
                put("^\\d{1,2}:\\d{1,2}$", "HH:mm");
                put("^\\d{4}-\\d{1,2}-\\d{1,2}t\\d{1,2}:\\d{2}:\\d{2}\\.\\d{1,3}[\\-\\+]\\d{4}$", "yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
                //2024-07-17T15:52:14.915+0300
                put("^\\d{4}-\\d{1,2}-\\d{1,2}t\\d{1,2}:\\d{2}:\\d{2}\\.\\d{1,3}$", "yyyy-MM-dd'T'HH:mm:ss.SSS");
                //2024-07-17T15:52:14.915
                put("^\\d{4}-\\d{1,2}-\\d{1,2}t\\d{1,2}:\\d{2}:\\d{2}$", "yyyy-MM-dd'T'HH:mm:ss");
                //2024-07-17T15:52:14
                put("^\\d{4}-\\d{1,2}-\\d{1,2}t\\d{1,2}:\\d{2}$", "yyyy-MM-dd'T'HH:mm");
                //2024-07-17T15:52
            }
        };
        if (dateString != null) {
            for (String regexp : DATE_FORMAT_REGEXPS.keySet()) {
                if (dateString.toLowerCase().matches(regexp)) {
                    return DATE_FORMAT_REGEXPS.get(regexp);
                }
            }
        }
        return null;
    }

    /**
     * Parse date from string with Calls {@link #determineDate(String)}
     *
     * @param date
     * @return java.util.Date
     */
    public static Date parseDate(String date) {
        Date ret = null;
        if ((date != null) && (!date.isEmpty())) {
            try {
                String format = determineDate(date);
                if (format==null){
                    throw new WrongDateException("Unknown date Regexp");
                }
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                ret = sdf.parse(date);
            } catch (ParseException ex) {
            }
        }
        return ret;
    }
}
