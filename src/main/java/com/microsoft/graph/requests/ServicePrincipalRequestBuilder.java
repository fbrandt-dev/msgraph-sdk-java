// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.models.SelfSignedCertificate;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ServicePrincipalAddKeyParameterSet;
import com.microsoft.graph.models.ServicePrincipalAddPasswordParameterSet;
import com.microsoft.graph.models.ServicePrincipalRemoveKeyParameterSet;
import com.microsoft.graph.models.ServicePrincipalRemovePasswordParameterSet;
import com.microsoft.graph.models.ServicePrincipalAddTokenSigningCertificateParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Request Builder.
 */
public class ServicePrincipalRequestBuilder extends BaseRequestBuilder<ServicePrincipal> {

    /**
     * The request builder for the ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ServicePrincipalRequest instance
     */
    @Nonnull
    public ServicePrincipalRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ServicePrincipalRequest instance
     */
    @Nonnull
    public ServicePrincipalRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ServicePrincipalRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AppManagementPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AppManagementPolicyCollectionWithReferencesRequestBuilder appManagementPolicies() {
        return new com.microsoft.graph.requests.AppManagementPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("appManagementPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppManagementPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AppManagementPolicyWithReferenceRequestBuilder appManagementPolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AppManagementPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("appManagementPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder appRoleAssignedTo() {
        return new com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignedTo"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder appRoleAssignedTo(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignedTo") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder appRoleAssignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ClaimsMappingPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ClaimsMappingPolicyCollectionWithReferencesRequestBuilder claimsMappingPolicies() {
        return new com.microsoft.graph.requests.ClaimsMappingPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ClaimsMappingPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ClaimsMappingPolicyWithReferenceRequestBuilder claimsMappingPolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ClaimsMappingPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder createdObjects(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder createdObjectsAsServicePrincipal() {
        return new com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalRequestBuilder createdObjectsAsServicePrincipal(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the DelegatedPermissionClassification collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DelegatedPermissionClassificationCollectionRequestBuilder delegatedPermissionClassifications() {
        return new com.microsoft.graph.requests.DelegatedPermissionClassificationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedPermissionClassifications"), getClient(), null);
    }

    /**
     * Gets a request builder for the DelegatedPermissionClassification item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DelegatedPermissionClassificationRequestBuilder delegatedPermissionClassifications(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DelegatedPermissionClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedPermissionClassifications") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EndpointCollectionRequestBuilder endpoints() {
        return new com.microsoft.graph.requests.EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints"), getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EndpointRequestBuilder endpoints(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the FederatedIdentityCredential collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.FederatedIdentityCredentialCollectionRequestBuilder federatedIdentityCredentials() {
        return new com.microsoft.graph.requests.FederatedIdentityCredentialCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("federatedIdentityCredentials"), getClient(), null);
    }

    /**
     * Gets a request builder for the FederatedIdentityCredential item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.FederatedIdentityCredentialRequestBuilder federatedIdentityCredentials(@Nonnull final String id) {
        return new com.microsoft.graph.requests.FederatedIdentityCredentialRequestBuilder(getRequestUrlWithAdditionalSegment("federatedIdentityCredentials") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the HomeRealmDiscoveryPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder homeRealmDiscoveryPolicies() {
        return new com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the HomeRealmDiscoveryPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder homeRealmDiscoveryPolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder memberOf(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupCollectionRequestBuilder memberOfAsGroup() {
        return new com.microsoft.graph.requests.GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupRequestBuilder memberOfAsGroup(@Nonnull final String id) {
        return new com.microsoft.graph.requests.GroupRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the AdministrativeUnit collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder memberOfAsAdministrativeUnit() {
        return new com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.administrativeUnit", getClient(), null);
    }

    /**
     * Gets a request builder for the AdministrativeUnit item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AdministrativeUnitRequestBuilder memberOfAsAdministrativeUnit(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AdministrativeUnitRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.administrativeUnit", getClient(), null);
    }
    /**
     *  Gets a request builder for the OAuth2PermissionGrant collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder oauth2PermissionGrants() {
        return new com.microsoft.graph.requests.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants"), getClient(), null);
    }

    /**
     * Gets a request builder for the OAuth2PermissionGrant item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.OAuth2PermissionGrantWithReferenceRequestBuilder oauth2PermissionGrants(@Nonnull final String id) {
        return new com.microsoft.graph.requests.OAuth2PermissionGrantWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("oauth2PermissionGrants") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder ownedObjects(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder ownedObjectsAsAppRoleAssignment() {
        return new com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder ownedObjectsAsAppRoleAssignment(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ApplicationCollectionRequestBuilder ownedObjectsAsApplication() {
        return new com.microsoft.graph.requests.ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ApplicationRequestBuilder ownedObjectsAsApplication(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EndpointCollectionRequestBuilder ownedObjectsAsEndpoint() {
        return new com.microsoft.graph.requests.EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EndpointRequestBuilder ownedObjectsAsEndpoint(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupCollectionRequestBuilder ownedObjectsAsGroup() {
        return new com.microsoft.graph.requests.GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupRequestBuilder ownedObjectsAsGroup(@Nonnull final String id) {
        return new com.microsoft.graph.requests.GroupRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder ownedObjectsAsServicePrincipal() {
        return new com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalRequestBuilder ownedObjectsAsServicePrincipal(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder owners(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder ownersAsAppRoleAssignment() {
        return new com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder ownersAsAppRoleAssignment(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EndpointCollectionRequestBuilder ownersAsEndpoint() {
        return new com.microsoft.graph.requests.EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EndpointRequestBuilder ownersAsEndpoint(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder ownersAsServicePrincipal() {
        return new com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServicePrincipalRequestBuilder ownersAsServicePrincipal(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.UserCollectionRequestBuilder ownersAsUser() {
        return new com.microsoft.graph.requests.UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.UserRequestBuilder ownersAsUser(@Nonnull final String id) {
        return new com.microsoft.graph.requests.UserRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the TokenIssuancePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder tokenIssuancePolicies() {
        return new com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the TokenIssuancePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.TokenIssuancePolicyWithReferenceRequestBuilder tokenIssuancePolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.TokenIssuancePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TokenLifetimePolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder tokenLifetimePolicies() {
        return new com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the TokenLifetimePolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.TokenLifetimePolicyWithReferenceRequestBuilder tokenLifetimePolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.TokenLifetimePolicyWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupCollectionRequestBuilder transitiveMemberOfAsGroup() {
        return new com.microsoft.graph.requests.GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupRequestBuilder transitiveMemberOfAsGroup(@Nonnull final String id) {
        return new com.microsoft.graph.requests.GroupRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the AdministrativeUnit collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder transitiveMemberOfAsAdministrativeUnit() {
        return new com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.administrativeUnit", getClient(), null);
    }

    /**
     * Gets a request builder for the AdministrativeUnit item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AdministrativeUnitRequestBuilder transitiveMemberOfAsAdministrativeUnit(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AdministrativeUnitRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.administrativeUnit", getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ServicePrincipalAddKeyRequestBuilder addKey(@Nonnull final ServicePrincipalAddKeyParameterSet parameters) {
        return new ServicePrincipalAddKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addKey"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ServicePrincipalAddPasswordRequestBuilder addPassword(@Nonnull final ServicePrincipalAddPasswordParameterSet parameters) {
        return new ServicePrincipalAddPasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addPassword"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ServicePrincipalRemoveKeyRequestBuilder removeKey(@Nonnull final ServicePrincipalRemoveKeyParameterSet parameters) {
        return new ServicePrincipalRemoveKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeKey"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ServicePrincipalRemovePasswordRequestBuilder removePassword(@Nonnull final ServicePrincipalRemovePasswordParameterSet parameters) {
        return new ServicePrincipalRemovePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removePassword"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ServicePrincipalAddTokenSigningCertificateRequestBuilder addTokenSigningCertificate(@Nonnull final ServicePrincipalAddTokenSigningCertificateParameterSet parameters) {
        return new ServicePrincipalAddTokenSigningCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addTokenSigningCertificate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSet parameters) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(@Nonnull final DirectoryObjectCheckMemberObjectsParameterSet parameters) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(@Nonnull final DirectoryObjectGetMemberGroupsParameterSet parameters) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(@Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
