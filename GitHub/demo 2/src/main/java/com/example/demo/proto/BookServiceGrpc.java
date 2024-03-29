package com.example.demo.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: book.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.proto.BookOuterClass.CategoryRequest,
      com.example.demo.proto.BookOuterClass.CategoryResponse> getFindBooksByCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindBooksByCategory",
      requestType = com.example.demo.proto.BookOuterClass.CategoryRequest.class,
      responseType = com.example.demo.proto.BookOuterClass.CategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.proto.BookOuterClass.CategoryRequest,
      com.example.demo.proto.BookOuterClass.CategoryResponse> getFindBooksByCategoryMethod() {
    io.grpc.MethodDescriptor<com.example.demo.proto.BookOuterClass.CategoryRequest, com.example.demo.proto.BookOuterClass.CategoryResponse> getFindBooksByCategoryMethod;
    if ((getFindBooksByCategoryMethod = BookServiceGrpc.getFindBooksByCategoryMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getFindBooksByCategoryMethod = BookServiceGrpc.getFindBooksByCategoryMethod) == null) {
          BookServiceGrpc.getFindBooksByCategoryMethod = getFindBooksByCategoryMethod =
              io.grpc.MethodDescriptor.<com.example.demo.proto.BookOuterClass.CategoryRequest, com.example.demo.proto.BookOuterClass.CategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindBooksByCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.proto.BookOuterClass.CategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.proto.BookOuterClass.CategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("FindBooksByCategory"))
              .build();
        }
      }
    }
    return getFindBooksByCategoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findBooksByCategory(com.example.demo.proto.BookOuterClass.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.proto.BookOuterClass.CategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindBooksByCategoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindBooksByCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.proto.BookOuterClass.CategoryRequest,
                com.example.demo.proto.BookOuterClass.CategoryResponse>(
                  this, METHODID_FIND_BOOKS_BY_CATEGORY)))
          .build();
    }
  }

  /**
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void findBooksByCategory(com.example.demo.proto.BookOuterClass.CategoryRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.proto.BookOuterClass.CategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindBooksByCategoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.proto.BookOuterClass.CategoryResponse findBooksByCategory(com.example.demo.proto.BookOuterClass.CategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindBooksByCategoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.proto.BookOuterClass.CategoryResponse> findBooksByCategory(
        com.example.demo.proto.BookOuterClass.CategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindBooksByCategoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BOOKS_BY_CATEGORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BOOKS_BY_CATEGORY:
          serviceImpl.findBooksByCategory((com.example.demo.proto.BookOuterClass.CategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.proto.BookOuterClass.CategoryResponse>) responseObserver);
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

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.proto.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getFindBooksByCategoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
