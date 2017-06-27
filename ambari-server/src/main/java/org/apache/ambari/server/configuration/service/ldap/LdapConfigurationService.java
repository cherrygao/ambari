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

package org.apache.ambari.server.configuration.service.ldap;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.ambari.server.configuration.domain.LdapConfiguration;
import org.apache.ambari.server.configuration.service.AmbariConfigurationService;
import org.apache.ambari.server.orm.dao.AmbariConfigurationDAO;
import org.apache.ambari.server.orm.entities.AmbariConfigurationEntity;

@Singleton
public class LdapConfigurationService extends AmbariConfigurationService {

  @Inject
  private AmbariConfigurationDAO ambariConfigurationDAO;

  @Inject
  public LdapConfigurationService() {
  }

  public LdapConfiguration getLdapConfiguration() {
    AmbariConfigurationEntity ambariConfigurationEntity = ambariConfigurationDAO.findByid(1L);
    return entityTodomain(ambariConfigurationEntity);
  }

  public void saveLdapConfiguration(LdapConfiguration ldapConfiguration) {
    // todo do we need this transformation? the incoming json probably can be persisted whitout being transformed into domain
    ambariConfigurationDAO.persist(domainToEntity(ldapConfiguration));
  }

  private AmbariConfigurationEntity domainToEntity(LdapConfiguration ldapConfiguration) {
    AmbariConfigurationEntity ambariConfigurationEntity = new AmbariConfigurationEntity();
    return ambariConfigurationEntity;
  }

  private LdapConfiguration entityTodomain(AmbariConfigurationEntity ambariConfigurationEntity) {
    LdapConfiguration ldapConfiguration = new LdapConfiguration();
    return ldapConfiguration;
  }


}
