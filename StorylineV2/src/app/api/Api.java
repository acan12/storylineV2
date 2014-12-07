package app.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import app.component.BaseComponent;

public class Api extends BaseApi {
	// routing backend api
	protected static final String DOMAIN_API_V1 = "https://abraresto.com/api/v1/";

	// Api urls connection to abraresto.com/api/v1
	private final String RESTO_POPULAR_API_URL = "restaurants?city_id=1&page=1&per_page=30";

	// internal variable
	private static Api api = null;

	// private ApiKey apik = null;
	private StringBuffer apiUrl;
	private BaseComponent component;

	public Api(BaseComponent component) {
		this.apiUrl = new StringBuffer(DOMAIN_API_V1);
		this.component = component;
	}

	public static Api getInstance(BaseComponent component) {
		if (api == null) {
			api = new Api(component);
		}
		api.setComponent(component);
		return api;
	}

	// Varians passing parameters 'params' , ''
	public Api restoPopularApiAsync() throws ClientProtocolException,
			IOException {

		ApiAsyncResponseHandler apiAsync = new ApiAsyncResponseHandler(api);

		api.get(apiUrl.append(RESTO_POPULAR_API_URL).toString(), apiAsync);

		return api;
	}

	// POJO architecture

	/**
	 * @return the component , Abraresto.com created at Aug 13, 2014
	 */
	public BaseComponent getComponent() {
		return component;
	}

	/**
	 * @param component
	 *            the component to set , Abraresto.com created at Aug 13, 2014
	 */
	public void setComponent(BaseComponent component) {
		this.component = component;
	}

}
