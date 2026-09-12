/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catneye.asterisk.AGI;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plintus
 */
public class EAGISignalThread implements Runnable {

    private Socket socket;
    //private ManagedChannel channel;

    public EAGISignalThread(Socket socket) {
        Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread start: {0}", socket.getLocalPort());
        this.socket = socket;
    }

    @Override
    public void run() {
        /*try {
            SberToken st = new SberToken();
            String token = st.getToken();

            if (token != null) {

                String host = "smartspeech.sber.ru";
                SslContext sslContext = GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();
                channel = NettyChannelBuilder.forTarget(host).sslContext(sslContext).build();

                BearerToken bt = new BearerToken(token);
                CallOptions callOpts = CallOptions.DEFAULT.withCallCredentials(bt);
                SmartSpeechStub stub = SmartSpeechGrpc.newStub(channel, callOpts);

                Integer sampleRate = 8000;
                Boolean enableMultiUtterance = false;
                Boolean enablePartialResults = false;
                String model = "general";
                Integer channels = 1;
                Integer duration = 2;//sec
                Integer bits = 16;

                RecognitionOptions opts = RecognitionOptions.newBuilder()
                        .setSampleRate(sampleRate)
                        .setModel(model)
                        .setAudioEncoding(RecognitionOptions.AudioEncoding.PCM_S16LE)
                        .setNoSpeechTimeout(Duration.newBuilder().setSeconds(15).build())
                        .setEnableMultiUtterance(enableMultiUtterance)
                        .setEnablePartialResults(enablePartialResults)
                        .build();
                RecognitionRequest request = RecognitionRequest.newBuilder().setOptions(opts).build();

                //Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread request: {0}", request);
                Integer chunkSize = (bits * sampleRate * channels * duration) / 8;
                //Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread fileSize: {0}", chunkSize);

                InputStream is = (socket.getInputStream());
                int BUFFER_SIZE = 1024;
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                byte[] chunk = new byte[0];

                StreamObserver<RecognitionRequest> rr = stub.recognize(streaming());
                rr.onNext(request);

                bytesRead = is.read(buffer);
                while ((bytesRead != -1) && (!socket.isClosed())) {
                    Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread bytesRead: {0}", bytesRead);
                    chunk = ArrayUtils.addAll(chunk, buffer);
                    if (chunk.length >= chunkSize) {
                        Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread send chunk: {0}", chunk.length);
                        //Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread send chunk: {0}", 
                        //        Arrays.toString(chunk));
                        rr.onNext(RecognitionRequest.newBuilder().setAudioChunk(ByteString.copyFrom(chunk)).build());
                        chunk = new byte[0];
                    }
                    bytesRead = is.read(buffer);
                }
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                socket.close();
            }
            Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread end: {0}", 0);
        } catch (IOException e) {
            Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread: {0}", e);
        } catch (InterruptedException e) {
            Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread: {0}", e);
        }*/
    }
/*
    public StreamObserver<RecognitionResponse> streaming() {
        return new StreamObserver<RecognitionResponse>() {
            @Override
            public void onNext(RecognitionResponse response) {
                Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread streaming onNext: {0}", response);
            }

            @Override
            public void onError(Throwable thrwbl) {
                Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread streaming onError: {0}", thrwbl);
                //close();
                //DEADLINE_EXCEEDED
            }

            @Override
            public void onCompleted() {
                Logger.getLogger(EAGISignalThread.class.getName()).log(Level.INFO, "EAGISignalThread streaming onCompleted: {0}", 0);
            }
        };
    }*/
}
