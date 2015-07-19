/*******************************************************************************
* Copyright 2015 Ivan Shubin http://mindengine.net
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*   http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
******************************************************************************/
package com.galenframework.runner;

import com.galenframework.suite.GalenPageAction;

public class GalenPageActionException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -4611555499199903117L;
    private GalenPageAction action;

    public GalenPageActionException(Exception reason, GalenPageAction action) {
        super(reason);
        this.action = action;
    }

    public Exception getReason() {
        return (Exception)getCause();
    }

    public GalenPageAction getAction() {
        return action;
    }

}