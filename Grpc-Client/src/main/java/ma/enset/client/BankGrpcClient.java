package ma.enset.client;

import ma.enset.stubs.BankServiceGrpc;
import ma.enset.stubs.Ebank;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BankGrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        Ebank.ConvertCurrencyRequest request = Ebank.ConvertCurrencyRequest.newBuilder()
                .setAmount(6800)
                .setCurrencyFrom("MAD")
                .setCurrencyTo("USD")
                .build();
        Ebank.ConvertCurrencyResponse currencyResponse = bankServiceBlockingStub.convert(request);
        System.out.println("Converted amount: " + currencyResponse);
    }
}
