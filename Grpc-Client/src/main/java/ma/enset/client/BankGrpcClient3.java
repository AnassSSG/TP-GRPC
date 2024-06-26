package ma.enset.client;

import ma.enset.stubs.BankServiceGrpc;
import ma.enset.stubs.Ebank;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class BankGrpcClient3 {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel);
        Ebank.ConvertCurrencyRequest request = Ebank.ConvertCurrencyRequest.newBuilder()
                .setAmount(6800)
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .build();
        asyncStub.getStream(request, new StreamObserver<Ebank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Ebank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println("*********************************");
                System.out.println(convertCurrencyResponse);
                System.out.println("*********************************");
            }


            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("End ---!");
            }
        });

        System.out.println("----------------?-----------------");
        System.in.read();
    }
}
