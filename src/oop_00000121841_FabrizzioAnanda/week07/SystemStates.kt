package oop_00000121841_FabrizzioAnanda.week07

enum class AppState {
    IDLE,
    RUNNING,
    FINISHED,
    ERROR
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}