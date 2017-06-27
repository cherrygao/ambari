/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.api.services;

import java.util.Collections;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.ambari.server.controller.spi.Resource;

import io.swagger.annotations.Api;

@Path("/configurations/")
@Api(value = "/configurations", description = "Endpoint for Ambari configuration related operations")
public class AmbariConfigurationRestService extends BaseService {

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public Response createAmbariConfiguration(String body, @Context HttpHeaders headers, @Context UriInfo uri) {
    return handleRequest(headers, body, uri, Request.Type.POST, createResource(Resource.Type.AmbariConfiguration,
      Collections.EMPTY_MAP));
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Response getAmbariConfigurations(String body, @Context HttpHeaders headers, @Context UriInfo uri) {
    return handleRequest(headers, body, uri, Request.Type.GET, createResource(Resource.Type.AmbariConfiguration,
      Collections.EMPTY_MAP));
  }

  @GET
  @Path("{configurationId}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response getAmbariConfiguration(String body, @Context HttpHeaders headers, @Context UriInfo uri,
                                         @PathParam("configurationId") String configurationId) {
    return handleRequest(headers, body, uri, Request.Type.GET, createResource(Resource.Type.AmbariConfiguration,
      Collections.singletonMap(Resource.Type.AmbariConfiguration, configurationId)));
  }

  @PUT
  @Produces(MediaType.TEXT_PLAIN)
  public Response updateAmbariConfiguration() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @DELETE
  @Path("{configurationId}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response deleteAmbariConfiguration(String body, @Context HttpHeaders headers, @Context UriInfo uri,
                                            @PathParam("configurationId") String configurationId) {
    return handleRequest(headers, body, uri, Request.Type.DELETE, createResource(Resource.Type.AmbariConfiguration,
      Collections.singletonMap(Resource.Type.AmbariConfiguration, configurationId)));
  }


}
