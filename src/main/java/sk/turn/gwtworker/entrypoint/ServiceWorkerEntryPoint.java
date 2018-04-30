package sk.turn.gwtworker.entrypoint;

import com.google.gwt.core.client.EntryPoint;
import gwt.jelement.serviceworkers.ServiceWorkerGlobalScope;

public abstract class ServiceWorkerEntryPoint implements EntryPoint {

	/**
	 * Get {@link ServiceWorkerGlobalScope} for current shared worker
	 */
	public final native ServiceWorkerGlobalScope getScope() /*-{ return $self; }-*/;

}
