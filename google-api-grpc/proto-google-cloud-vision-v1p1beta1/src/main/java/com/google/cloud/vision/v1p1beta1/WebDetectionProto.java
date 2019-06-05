// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/web_detection.proto

package com.google.cloud.vision.v1p1beta1;

public final class WebDetectionProto {
  private WebDetectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebEntity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebPage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebLabel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/vision/v1p1beta1/web_dete"
          + "ction.proto\022\035google.cloud.vision.v1p1bet"
          + "a1\032\034google/api/annotations.proto\"\214\007\n\014Web"
          + "Detection\022K\n\014web_entities\030\001 \003(\01325.google"
          + ".cloud.vision.v1p1beta1.WebDetection.Web"
          + "Entity\022R\n\024full_matching_images\030\002 \003(\01324.g"
          + "oogle.cloud.vision.v1p1beta1.WebDetectio"
          + "n.WebImage\022U\n\027partial_matching_images\030\003 "
          + "\003(\01324.google.cloud.vision.v1p1beta1.WebD"
          + "etection.WebImage\022W\n\032pages_with_matching"
          + "_images\030\004 \003(\01323.google.cloud.vision.v1p1"
          + "beta1.WebDetection.WebPage\022U\n\027visually_s"
          + "imilar_images\030\006 \003(\01324.google.cloud.visio"
          + "n.v1p1beta1.WebDetection.WebImage\022O\n\021bes"
          + "t_guess_labels\030\010 \003(\01324.google.cloud.visi"
          + "on.v1p1beta1.WebDetection.WebLabel\032B\n\tWe"
          + "bEntity\022\021\n\tentity_id\030\001 \001(\t\022\r\n\005score\030\002 \001("
          + "\002\022\023\n\013description\030\003 \001(\t\032&\n\010WebImage\022\013\n\003ur"
          + "l\030\001 \001(\t\022\r\n\005score\030\002 \001(\002\032\344\001\n\007WebPage\022\013\n\003ur"
          + "l\030\001 \001(\t\022\r\n\005score\030\002 \001(\002\022\022\n\npage_title\030\003 \001"
          + "(\t\022R\n\024full_matching_images\030\004 \003(\01324.googl"
          + "e.cloud.vision.v1p1beta1.WebDetection.We"
          + "bImage\022U\n\027partial_matching_images\030\005 \003(\0132"
          + "4.google.cloud.vision.v1p1beta1.WebDetec"
          + "tion.WebImage\0320\n\010WebLabel\022\r\n\005label\030\001 \001(\t"
          + "\022\025\n\rlanguage_code\030\002 \001(\tB\200\001\n!com.google.c"
          + "loud.vision.v1p1beta1B\021WebDetectionProto"
          + "P\001ZCgoogle.golang.org/genproto/googleapi"
          + "s/cloud/vision/v1p1beta1;vision\370\001\001b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor,
            new java.lang.String[] {
              "WebEntities",
              "FullMatchingImages",
              "PartialMatchingImages",
              "PagesWithMatchingImages",
              "VisuallySimilarImages",
              "BestGuessLabels",
            });
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebEntity_descriptor =
        internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebEntity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebEntity_descriptor,
            new java.lang.String[] {
              "EntityId", "Score", "Description",
            });
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebImage_descriptor =
        internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebImage_descriptor,
            new java.lang.String[] {
              "Url", "Score",
            });
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebPage_descriptor =
        internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebPage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebPage_descriptor,
            new java.lang.String[] {
              "Url", "Score", "PageTitle", "FullMatchingImages", "PartialMatchingImages",
            });
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebLabel_descriptor =
        internal_static_google_cloud_vision_v1p1beta1_WebDetection_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebLabel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p1beta1_WebDetection_WebLabel_descriptor,
            new java.lang.String[] {
              "Label", "LanguageCode",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
