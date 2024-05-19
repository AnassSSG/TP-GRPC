package ma.enset.server;

import ma.enset.service.GrpcBankService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BankServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server= ServerBuilder.forPort(8888)
                .addService(new GrpcBankService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
