/*
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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindSlbRequest extends RoaAcsRequest<BindSlbResponse> {
	   

	private String vServerGroupId;

	private Integer listenerPort;

	private String slbId;

	private String appId;

	private String slbIp;

	private String type;
	public BindSlbRequest() {
		super("Edas", "2017-08-01", "BindSlb", "edas");
		setUriPattern("/pop/app/bind_slb_json");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
		}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort.toString());
		}
	}

	public String getSlbId() {
		return this.slbId;
	}

	public void setSlbId(String slbId) {
		this.slbId = slbId;
		if(slbId != null){
			putQueryParameter("SlbId", slbId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getSlbIp() {
		return this.slbIp;
	}

	public void setSlbIp(String slbIp) {
		this.slbIp = slbIp;
		if(slbIp != null){
			putQueryParameter("SlbIp", slbIp);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	@Override
	public Class<BindSlbResponse> getResponseClass() {
		return BindSlbResponse.class;
	}

}
