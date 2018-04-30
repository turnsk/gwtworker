/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package sk.turn.gwtworker.linker;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.core.ext.linker.LinkerOrder.Order;
import com.google.gwt.core.ext.linker.impl.SelectionScriptLinker;

/**
 * Linker for HTML 5 Web Workers.
 */
@LinkerOrder(Order.PRIMARY)
public class WorkerLinker extends SelectionScriptLinker {

  @Override
  public String getDescription() {
    return "Web Worker Linker";
  }

  @Override
  protected String getCompilationExtension(TreeLogger logger, LinkerContext context) {
    return FRAGMENT_EXTENSION;
  }

  @Override
  protected String getModulePrefix(TreeLogger logger, LinkerContext context, String strongName) {
    return "";
  }

  @Override
  protected String getModuleSuffix2(TreeLogger logger, LinkerContext context, String strongName) {
	return "";
  }

  @Override
  protected String getSelectionScriptTemplate(TreeLogger logger, LinkerContext context) {
    return "sk/turn/gwtworker/linker/WorkerTemplate.js";
  }

}
