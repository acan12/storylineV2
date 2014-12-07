package app.api;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONObject;

import com.loopj.android.http.JsonHttpResponseHandler;

public class ApiAsyncResponseHandler extends JsonHttpResponseHandler {

	private Api api;

	public ApiAsyncResponseHandler(Api api) {
		this.api = api;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.loopj.android.http.JsonHttpResponseHandler#onFailure(int,
	 * org.apache.http.Header[], java.lang.Throwable, org.json.JSONArray)
	 */
	@Override
	public void onFailure(int statusCode, Header[] headers,
			Throwable throwable, JSONArray errorResponse) {
		// TODO Auto-generated method stub
		// super.onFailure(statusCode, headers, throwable, errorResponse);
		api.getComponent().onFailureApi(statusCode, headers, throwable,
				errorResponse);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.loopj.android.http.JsonHttpResponseHandler#onSuccess(int,
	 * org.apache.http.Header[], java.lang.String)
	 */
	@Override
	public void onSuccess(int statusCode, Header[] headers, JSONArray responses) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.loopj.android.http.JsonHttpResponseHandler#onSuccess(int,
	 * org.apache.http.Header[], org.json.JSONObject)
	 */
	@Override
	public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
		api.getComponent().onSuccessApi(response);
	}

	// POJO
	/**
	 * @return the api , Abraresto.com created at Aug 13, 2014
	 */
	public Api getApi() {
		return api;
	}

	/**
	 * @param api
	 *            the api to set , Abraresto.com created at Aug 13, 2014
	 */
	public void setApi(Api api) {
		this.api = api;
	}

}
