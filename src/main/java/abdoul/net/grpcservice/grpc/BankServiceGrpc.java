package abdoul.net.grpcservice.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest,
      abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse> getGetBankAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBankAccount",
      requestType = abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest.class,
      responseType = abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest,
      abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse> getGetBankAccountMethod() {
    io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest, abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse> getGetBankAccountMethod;
    if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
          BankServiceGrpc.getGetBankAccountMethod = getGetBankAccountMethod =
              io.grpc.MethodDescriptor.<abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest, abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBankAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBankAccount"))
              .build();
        }
      }
    }
    return getGetBankAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest,
      abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse> getGetAllBankAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllBankAccounts",
      requestType = abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest.class,
      responseType = abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest,
      abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse> getGetAllBankAccountsMethod() {
    io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest, abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse> getGetAllBankAccountsMethod;
    if ((getGetAllBankAccountsMethod = BankServiceGrpc.getGetAllBankAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetAllBankAccountsMethod = BankServiceGrpc.getGetAllBankAccountsMethod) == null) {
          BankServiceGrpc.getGetAllBankAccountsMethod = getGetAllBankAccountsMethod =
              io.grpc.MethodDescriptor.<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest, abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllBankAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getAllBankAccounts"))
              .build();
        }
      }
    }
    return getGetAllBankAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest,
      abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse> getConvertCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertCurrency",
      requestType = abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest.class,
      responseType = abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest,
      abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse> getConvertCurrencyMethod() {
    io.grpc.MethodDescriptor<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest, abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse> getConvertCurrencyMethod;
    if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
          BankServiceGrpc.getConvertCurrencyMethod = getConvertCurrencyMethod =
              io.grpc.MethodDescriptor.<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest, abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "convertCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertCurrency"))
              .build();
        }
      }
    }
    return getConvertCurrencyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getBankAccount(abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest request,
        io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBankAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAllBankAccounts(abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest request,
        io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllBankAccountsMethod(), responseObserver);
    }

    /**
     */
    default void convertCurrency(abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertCurrencyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankService.
   */
  public static abstract class BankServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankService.
   */
  public static final class BankServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBankAccount(abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest request,
        io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllBankAccounts(abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest request,
        io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllBankAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convertCurrency(abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankService.
   */
  public static final class BankServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse getBankAccount(abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBankAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse getAllBankAccounts(abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllBankAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse convertCurrency(abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertCurrencyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankService.
   */
  public static final class BankServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse> getBankAccount(
        abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse> getAllBankAccounts(
        abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllBankAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse> convertCurrency(
        abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK_ACCOUNT = 0;
  private static final int METHODID_GET_ALL_BANK_ACCOUNTS = 1;
  private static final int METHODID_CONVERT_CURRENCY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK_ACCOUNT:
          serviceImpl.getBankAccount((abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest) request,
              (io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_BANK_ACCOUNTS:
          serviceImpl.getAllBankAccounts((abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest) request,
              (io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse>) responseObserver);
          break;
        case METHODID_CONVERT_CURRENCY:
          serviceImpl.convertCurrency((abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetBankAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              abdoul.net.grpcservice.grpc.Grpc.BankAccountRequest,
              abdoul.net.grpcservice.grpc.Grpc.BankAccountResponse>(
                service, METHODID_GET_BANK_ACCOUNT)))
        .addMethod(
          getGetAllBankAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              abdoul.net.grpcservice.grpc.Grpc.ListBankAccountRequest,
              abdoul.net.grpcservice.grpc.Grpc.ListBankAccountResponse>(
                service, METHODID_GET_ALL_BANK_ACCOUNTS)))
        .addMethod(
          getConvertCurrencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyRequest,
              abdoul.net.grpcservice.grpc.Grpc.ConvertCurrencyResponse>(
                service, METHODID_CONVERT_CURRENCY)))
        .build();
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return abdoul.net.grpcservice.grpc.Grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BankServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBankAccountMethod())
              .addMethod(getGetAllBankAccountsMethod())
              .addMethod(getConvertCurrencyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
