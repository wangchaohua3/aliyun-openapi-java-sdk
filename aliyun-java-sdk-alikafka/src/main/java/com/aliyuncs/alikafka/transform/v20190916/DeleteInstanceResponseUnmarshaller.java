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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.DeleteInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteInstanceResponseUnmarshaller {

	public static DeleteInstanceResponse unmarshall(DeleteInstanceResponse deleteInstanceResponse, UnmarshallerContext _ctx) {
		
		deleteInstanceResponse.setRequestId(_ctx.stringValue("DeleteInstanceResponse.RequestId"));
		deleteInstanceResponse.setSuccess(_ctx.booleanValue("DeleteInstanceResponse.Success"));
		deleteInstanceResponse.setCode(_ctx.integerValue("DeleteInstanceResponse.Code"));
		deleteInstanceResponse.setMessage(_ctx.stringValue("DeleteInstanceResponse.Message"));
	 
	 	return deleteInstanceResponse;
	}
}