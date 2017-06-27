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

package org.apache.ambari.server.configuration.domain;

import org.apache.ambari.server.configuration.AmbariConfiguration;

public class LdapConfiguration implements AmbariConfiguration {

  private String primaryUrl;
  private String secondaryUrl;

  private boolean anonymousBind;
  private String managerDn;
  private String managerPassword;
  private String baseDN;
  private String dnAttribute;
  private String referralMethod;

  //LDAP group properties
  private String groupBase;
  private String groupObjectClass;
  private String groupMembershipAttr;
  private String groupSearchBase;
  private String groupSearchFilter;

  //LDAP user properties
  private String userBase;
  private String userObjectClass;
  private String usernameAttribute;
  private String userSearchBase;
  private String userSearchFilter;

  public String getPrimaryUrl() {
    return primaryUrl;
  }

  public void setPrimaryUrl(String primaryUrl) {
    this.primaryUrl = primaryUrl;
  }

  public String getSecondaryUrl() {
    return secondaryUrl;
  }

  public void setSecondaryUrl(String secondaryUrl) {
    this.secondaryUrl = secondaryUrl;
  }

  public boolean isAnonymousBind() {
    return anonymousBind;
  }

  public void setAnonymousBind(boolean anonymousBind) {
    this.anonymousBind = anonymousBind;
  }

  public String getManagerDn() {
    return managerDn;
  }

  public void setManagerDn(String managerDn) {
    this.managerDn = managerDn;
  }

  public String getManagerPassword() {
    return managerPassword;
  }

  public void setManagerPassword(String managerPassword) {
    this.managerPassword = managerPassword;
  }

  public String getBaseDN() {
    return baseDN;
  }

  public void setBaseDN(String baseDN) {
    this.baseDN = baseDN;
  }

  public String getDnAttribute() {
    return dnAttribute;
  }

  public void setDnAttribute(String dnAttribute) {
    this.dnAttribute = dnAttribute;
  }

  public String getReferralMethod() {
    return referralMethod;
  }

  public void setReferralMethod(String referralMethod) {
    this.referralMethod = referralMethod;
  }

  public String getGroupBase() {
    return groupBase;
  }

  public void setGroupBase(String groupBase) {
    this.groupBase = groupBase;
  }

  public String getGroupObjectClass() {
    return groupObjectClass;
  }

  public void setGroupObjectClass(String groupObjectClass) {
    this.groupObjectClass = groupObjectClass;
  }

  public String getGroupMembershipAttr() {
    return groupMembershipAttr;
  }

  public void setGroupMembershipAttr(String groupMembershipAttr) {
    this.groupMembershipAttr = groupMembershipAttr;
  }

  public String getGroupSearchBase() {
    return groupSearchBase;
  }

  public void setGroupSearchBase(String groupSearchBase) {
    this.groupSearchBase = groupSearchBase;
  }

  public String getGroupSearchFilter() {
    return groupSearchFilter;
  }

  public void setGroupSearchFilter(String groupSearchFilter) {
    this.groupSearchFilter = groupSearchFilter;
  }

  public String getUserBase() {
    return userBase;
  }

  public void setUserBase(String userBase) {
    this.userBase = userBase;
  }

  public String getUserObjectClass() {
    return userObjectClass;
  }

  public void setUserObjectClass(String userObjectClass) {
    this.userObjectClass = userObjectClass;
  }

  public String getUsernameAttribute() {
    return usernameAttribute;
  }

  public void setUsernameAttribute(String usernameAttribute) {
    this.usernameAttribute = usernameAttribute;
  }

  public String getUserSearchBase() {
    return userSearchBase;
  }

  public void setUserSearchBase(String userSearchBase) {
    this.userSearchBase = userSearchBase;
  }

  public String getUserSearchFilter() {
    return userSearchFilter;
  }

  public void setUserSearchFilter(String userSearchFilter) {
    this.userSearchFilter = userSearchFilter;
  }
}
