package martinez.ulises.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "019ef4970ea27eeacb6ebc291894ee49"
interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse

}