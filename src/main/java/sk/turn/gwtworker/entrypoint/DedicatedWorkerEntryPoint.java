package sk.turn.gwtworker.entrypoint;

import com.google.gwt.core.client.EntryPoint;
import gwt.jelement.workers.DedicatedWorkerGlobalScope;

public abstract class DedicatedWorkerEntryPoint implements EntryPoint {

	/**
	 * Get {@link DedicatedWorkerGlobalScope} for current dedicated worker
	 */
	public final native DedicatedWorkerGlobalScope getScope() /*-{ return $self; }-*/;

}
