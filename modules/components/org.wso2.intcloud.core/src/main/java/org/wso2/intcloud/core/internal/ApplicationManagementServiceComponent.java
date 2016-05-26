/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package org.wso2.intcloud.core.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;

/**
 * @scr.component name="ApplicationManagementServiceComponent" immediate="true"
 */
public class ApplicationManagementServiceComponent {

    private static BundleContext bundleContext;
    private static Log log = LogFactory.getLog(ApplicationManagementServiceComponent.class);

    protected void activate(ComponentContext context) {

        if(log.isDebugEnabled()){
            log.debug("ApplicationManagementServiceComponent activated");
        }
    }

    protected void deactivate(org.osgi.service.component.ComponentContext context) {

        if(log.isDebugEnabled()){
            log.debug("ApplicationManagementServiceComponent deactivated");
        }
    }

    public static BundleContext getBundleContext() {
        return bundleContext;
    }

    public static void setBundleContext(BundleContext bundleContext) {
        ApplicationManagementServiceComponent.bundleContext = bundleContext;
    }

}
