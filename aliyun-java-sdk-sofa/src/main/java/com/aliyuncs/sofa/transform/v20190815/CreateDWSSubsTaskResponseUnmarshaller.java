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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateDWSSubsTaskResponse;
import com.aliyuncs.sofa.model.v20190815.CreateDWSSubsTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDWSSubsTaskResponseUnmarshaller {

	public static CreateDWSSubsTaskResponse unmarshall(CreateDWSSubsTaskResponse createDWSSubsTaskResponse, UnmarshallerContext _ctx) {
		
		createDWSSubsTaskResponse.setRequestId(_ctx.stringValue("CreateDWSSubsTaskResponse.RequestId"));
		createDWSSubsTaskResponse.setResultCode(_ctx.stringValue("CreateDWSSubsTaskResponse.ResultCode"));
		createDWSSubsTaskResponse.setResultMessage(_ctx.stringValue("CreateDWSSubsTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setClusterUrl(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.ClusterUrl"));
		data.setComment(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.Comment"));
		data.setConnectionString(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.ConnectionString"));
		data.setConsumer(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.Consumer"));
		data.setGmtCreate(_ctx.longValue("CreateDWSSubsTaskResponse.Data.GmtCreate"));
		data.setGmtModify(_ctx.longValue("CreateDWSSubsTaskResponse.Data.GmtModify"));
		data.setGroup(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.Group"));
		data.setId(_ctx.longValue("CreateDWSSubsTaskResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.Status"));
		data.setTableId(_ctx.stringValue("CreateDWSSubsTaskResponse.Data.TableId"));
		createDWSSubsTaskResponse.setData(data);
	 
	 	return createDWSSubsTaskResponse;
	}
}