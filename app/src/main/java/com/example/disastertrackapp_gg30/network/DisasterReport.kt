package com.example.disastertrackapp_gg30.network

data class DisasterReport(
    val type: String,
    val geometries: List<Geometry>
)

data class Geometry(
    val type: String,
    val properties: Properties,
    val coordinates: List<Double>
)

data class Properties(
    val pkey: String,
    val created_at: String,
    val source: String,
    val status: String,
    val url: String,
    val image_url: String,
    val disaster_type: String,
    val report_data: ReportData,
    val tags: Tags,
    val title: String?,
    val text: String?,
    val partner_code: String?,
    val partner_icon: String?
)

data class ReportData(
    val report_type: String,
    val volcanicSigns: List<Int>,
    val evacuationNumber: Int,
    val evacuationArea: Boolean
)

data class Tags(
    val district_id: String?,
    val region_code: String,
    val local_area_id: String?,
    val instance_region_code: String
)

data class ApiResult(
    val statusCode: Int,
    val result: ResultData
)

data class ResultData(
    val type: String,
    val objects: Objects
)

data class Objects(
    val output: Output
)

data class Output(
    val type: String,
    val geometries: List<Geometry>
)


