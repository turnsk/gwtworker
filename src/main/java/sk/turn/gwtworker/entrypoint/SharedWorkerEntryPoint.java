package sk.turn.gwtworker.entrypoint;

import com.google.gwt.core.client.EntryPoint;
import gwt.jelement.workers.SharedWorkerGlobalScope;

public abstract class SharedWorkerEntryPoint implements EntryPoint {

	/**
	 * Get {@link SharedWorkerGlobalScope} for current shared worker
	 */
	public final native SharedWorkerGlobalScope getScope() /*-{ return $self; }-*/;

}
