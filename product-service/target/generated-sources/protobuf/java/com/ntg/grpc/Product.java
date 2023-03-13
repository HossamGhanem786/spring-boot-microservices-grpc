// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.ntg.grpc;

public final class Product {
  private Product() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_GreetingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_ProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_ProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_Id_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_Id_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_ProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_ProductPageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_ProductPageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_PaginationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_PaginationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_OrderId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_OrderId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntg_grpc_OrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntg_grpc_OrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022\014com.ntg.grpc\032\033google/pr" +
      "otobuf/empty.proto\"\"\n\017GreetingRequest\022\017\n" +
      "\007message\030\001 \001(\t\"#\n\020GreetingResponse\022\017\n\007me" +
      "ssage\030\001 \001(\t\";\n\016ProductRequest\022\014\n\004name\030\002 " +
      "\001(\t\022\014\n\004type\030\003 \001(\t\022\r\n\005price\030\004 \001(\t\"\020\n\002Id\022\n" +
      "\n\002id\030\001 \001(\t\"H\n\017ProductResponse\022\n\n\002id\030\001 \001(" +
      "\t\022\014\n\004name\030\002 \001(\t\022\014\n\004type\030\003 \001(\t\022\r\n\005price\030\004" +
      " \001(\t\"\247\001\n\023ProductPageResponse\0226\n\017productR" +
      "esponse\030\001 \003(\0132\035.com.ntg.grpc.ProductResp" +
      "onse\022\014\n\004size\030\002 \001(\005\022\025\n\rtotalElements\030\003 \001(" +
      "\005\022\022\n\ntotalPages\030\004 \001(\005\022\017\n\007isFirst\030\005 \001(\010\022\016" +
      "\n\006isLast\030\006 \001(\010\"I\n\021PaginationRequest\022\013\n\003m" +
      "in\030\001 \001(\001\022\013\n\003max\030\002 \001(\001\022\014\n\004page\030\003 \001(\005\022\014\n\004s" +
      "ize\030\004 \001(\005\"\025\n\007OrderId\022\n\n\002id\030\001 \001(\005\"4\n\rOrde" +
      "rResponse\022\017\n\007orderId\030\001 \001(\005\022\022\n\ntotalPrice" +
      "\030\002 \001(\0052\204\004\n\016ProductService\022K\n\010greeting\022\035." +
      "com.ntg.grpc.GreetingRequest\032\036.com.ntg.g" +
      "rpc.GreetingResponse\"\000\022K\n\naddProduct\022\034.c" +
      "om.ntg.grpc.ProductRequest\032\035.com.ntg.grp" +
      "c.ProductResponse\"\000\022<\n\007findOne\022\020.com.ntg" +
      ".grpc.Id\032\035.com.ntg.grpc.ProductResponse\"" +
      "\000\022E\n\010products\022\026.google.protobuf.Empty\032\035." +
      "com.ntg.grpc.ProductResponse\"\0000\001\022?\n\tdele" +
      "teOne\022\020.com.ntg.grpc.Id\032\036.com.ntg.grpc.G" +
      "reetingResponse\"\000\022S\n\013productPage\022\037.com.n" +
      "tg.grpc.PaginationRequest\032!.com.ntg.grpc" +
      ".ProductPageResponse\"\000\022=\n\005order\022\025.com.nt" +
      "g.grpc.OrderId\032\033.com.ntg.grpc.OrderRespo" +
      "nse\"\000B\020\n\014com.ntg.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_com_ntg_grpc_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ntg_grpc_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_GreetingRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_ntg_grpc_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ntg_grpc_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_GreetingResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_ntg_grpc_ProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ntg_grpc_ProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_ProductRequest_descriptor,
        new java.lang.String[] { "Name", "Type", "Price", });
    internal_static_com_ntg_grpc_Id_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ntg_grpc_Id_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_Id_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_ntg_grpc_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_ntg_grpc_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_ProductResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Type", "Price", });
    internal_static_com_ntg_grpc_ProductPageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_ntg_grpc_ProductPageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_ProductPageResponse_descriptor,
        new java.lang.String[] { "ProductResponse", "Size", "TotalElements", "TotalPages", "IsFirst", "IsLast", });
    internal_static_com_ntg_grpc_PaginationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_ntg_grpc_PaginationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_PaginationRequest_descriptor,
        new java.lang.String[] { "Min", "Max", "Page", "Size", });
    internal_static_com_ntg_grpc_OrderId_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_ntg_grpc_OrderId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_OrderId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_ntg_grpc_OrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_ntg_grpc_OrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntg_grpc_OrderResponse_descriptor,
        new java.lang.String[] { "OrderId", "TotalPrice", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
