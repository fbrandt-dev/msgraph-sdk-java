// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AuthenticationMethodsPolicy;
import com.microsoft.graph.models.AuthenticationFlowsPolicy;
import com.microsoft.graph.models.AuthorizationPolicy;
import com.microsoft.graph.models.CrossTenantAccessPolicy;
import com.microsoft.graph.models.TenantAppManagementPolicy;
import com.microsoft.graph.models.AdminConsentRequestPolicy;
import com.microsoft.graph.models.IdentitySecurityDefaultsEnforcementPolicy;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AuthenticationStrengthPolicyCollectionPage;
import com.microsoft.graph.requests.ActivityBasedTimeoutPolicyCollectionPage;
import com.microsoft.graph.requests.AppManagementPolicyCollectionPage;
import com.microsoft.graph.requests.ClaimsMappingPolicyCollectionPage;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.PermissionGrantPolicyCollectionPage;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage;
import com.microsoft.graph.requests.FeatureRolloutPolicyCollectionPage;
import com.microsoft.graph.requests.ConditionalAccessPolicyCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root.
 */
public class PolicyRoot extends Entity implements IJsonBackedObject {


    /**
     * The Authentication Methods Policy.
     * The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     */
    @SerializedName(value = "authenticationMethodsPolicy", alternate = {"AuthenticationMethodsPolicy"})
    @Expose
	@Nullable
    public AuthenticationMethodsPolicy authenticationMethodsPolicy;

    /**
     * The Authentication Strength Policies.
     * 
     */
    @SerializedName(value = "authenticationStrengthPolicies", alternate = {"AuthenticationStrengthPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AuthenticationStrengthPolicyCollectionPage authenticationStrengthPolicies;

    /**
     * The Authentication Flows Policy.
     * The policy configuration of the self-service sign-up experience of external users.
     */
    @SerializedName(value = "authenticationFlowsPolicy", alternate = {"AuthenticationFlowsPolicy"})
    @Expose
	@Nullable
    public AuthenticationFlowsPolicy authenticationFlowsPolicy;

    /**
     * The Activity Based Timeout Policies.
     * The policy that controls the idle time out for web sessions for applications.
     */
    @SerializedName(value = "activityBasedTimeoutPolicies", alternate = {"ActivityBasedTimeoutPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ActivityBasedTimeoutPolicyCollectionPage activityBasedTimeoutPolicies;

    /**
     * The App Management Policies.
     * The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     */
    @SerializedName(value = "appManagementPolicies", alternate = {"AppManagementPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AppManagementPolicyCollectionPage appManagementPolicies;

    /**
     * The Authorization Policy.
     * The policy that controls Azure AD authorization settings.
     */
    @SerializedName(value = "authorizationPolicy", alternate = {"AuthorizationPolicy"})
    @Expose
	@Nullable
    public AuthorizationPolicy authorizationPolicy;

    /**
     * The Claims Mapping Policies.
     * The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     */
    @SerializedName(value = "claimsMappingPolicies", alternate = {"ClaimsMappingPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ClaimsMappingPolicyCollectionPage claimsMappingPolicies;

    /**
     * The Cross Tenant Access Policy.
     * The custom rules that define an access scenario when interacting with external Azure AD tenants.
     */
    @SerializedName(value = "crossTenantAccessPolicy", alternate = {"CrossTenantAccessPolicy"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicy crossTenantAccessPolicy;

    /**
     * The Default App Management Policy.
     * The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     */
    @SerializedName(value = "defaultAppManagementPolicy", alternate = {"DefaultAppManagementPolicy"})
    @Expose
	@Nullable
    public TenantAppManagementPolicy defaultAppManagementPolicy;

    /**
     * The Home Realm Discovery Policies.
     * The policy to control Azure AD authentication behavior for federated users.
     */
    @SerializedName(value = "homeRealmDiscoveryPolicies", alternate = {"HomeRealmDiscoveryPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Permission Grant Policies.
     * The policy that specifies the conditions under which consent can be granted.
     */
    @SerializedName(value = "permissionGrantPolicies", alternate = {"PermissionGrantPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.PermissionGrantPolicyCollectionPage permissionGrantPolicies;

    /**
     * The Token Issuance Policies.
     * The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     */
    @SerializedName(value = "tokenIssuancePolicies", alternate = {"TokenIssuancePolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     */
    @SerializedName(value = "tokenLifetimePolicies", alternate = {"TokenLifetimePolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Feature Rollout Policies.
     * The feature rollout policy associated with a directory object.
     */
    @SerializedName(value = "featureRolloutPolicies", alternate = {"FeatureRolloutPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.FeatureRolloutPolicyCollectionPage featureRolloutPolicies;

    /**
     * The Admin Consent Request Policy.
     * The policy by which consent requests are created and managed for the entire tenant.
     */
    @SerializedName(value = "adminConsentRequestPolicy", alternate = {"AdminConsentRequestPolicy"})
    @Expose
	@Nullable
    public AdminConsentRequestPolicy adminConsentRequestPolicy;

    /**
     * The Conditional Access Policies.
     * The custom rules that define an access scenario.
     */
    @SerializedName(value = "conditionalAccessPolicies", alternate = {"ConditionalAccessPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ConditionalAccessPolicyCollectionPage conditionalAccessPolicies;

    /**
     * The Identity Security Defaults Enforcement Policy.
     * The policy that represents the security defaults that protect against common attacks.
     */
    @SerializedName(value = "identitySecurityDefaultsEnforcementPolicy", alternate = {"IdentitySecurityDefaultsEnforcementPolicy"})
    @Expose
	@Nullable
    public IdentitySecurityDefaultsEnforcementPolicy identitySecurityDefaultsEnforcementPolicy;

    /**
     * The Role Management Policies.
     * Specifies the various policies associated with scopes and roles.
     */
    @SerializedName(value = "roleManagementPolicies", alternate = {"RoleManagementPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UnifiedRoleManagementPolicyCollectionPage roleManagementPolicies;

    /**
     * The Role Management Policy Assignments.
     * The assignment of a role management policy to a role definition object.
     */
    @SerializedName(value = "roleManagementPolicyAssignments", alternate = {"RoleManagementPolicyAssignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UnifiedRoleManagementPolicyAssignmentCollectionPage roleManagementPolicyAssignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("authenticationStrengthPolicies")) {
            authenticationStrengthPolicies = serializer.deserializeObject(json.get("authenticationStrengthPolicies"), com.microsoft.graph.requests.AuthenticationStrengthPolicyCollectionPage.class);
        }

        if (json.has("activityBasedTimeoutPolicies")) {
            activityBasedTimeoutPolicies = serializer.deserializeObject(json.get("activityBasedTimeoutPolicies"), com.microsoft.graph.requests.ActivityBasedTimeoutPolicyCollectionPage.class);
        }

        if (json.has("appManagementPolicies")) {
            appManagementPolicies = serializer.deserializeObject(json.get("appManagementPolicies"), com.microsoft.graph.requests.AppManagementPolicyCollectionPage.class);
        }

        if (json.has("claimsMappingPolicies")) {
            claimsMappingPolicies = serializer.deserializeObject(json.get("claimsMappingPolicies"), com.microsoft.graph.requests.ClaimsMappingPolicyCollectionPage.class);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            homeRealmDiscoveryPolicies = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies"), com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage.class);
        }

        if (json.has("permissionGrantPolicies")) {
            permissionGrantPolicies = serializer.deserializeObject(json.get("permissionGrantPolicies"), com.microsoft.graph.requests.PermissionGrantPolicyCollectionPage.class);
        }

        if (json.has("tokenIssuancePolicies")) {
            tokenIssuancePolicies = serializer.deserializeObject(json.get("tokenIssuancePolicies"), com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage.class);
        }

        if (json.has("tokenLifetimePolicies")) {
            tokenLifetimePolicies = serializer.deserializeObject(json.get("tokenLifetimePolicies"), com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage.class);
        }

        if (json.has("featureRolloutPolicies")) {
            featureRolloutPolicies = serializer.deserializeObject(json.get("featureRolloutPolicies"), com.microsoft.graph.requests.FeatureRolloutPolicyCollectionPage.class);
        }

        if (json.has("conditionalAccessPolicies")) {
            conditionalAccessPolicies = serializer.deserializeObject(json.get("conditionalAccessPolicies"), com.microsoft.graph.requests.ConditionalAccessPolicyCollectionPage.class);
        }

        if (json.has("roleManagementPolicies")) {
            roleManagementPolicies = serializer.deserializeObject(json.get("roleManagementPolicies"), com.microsoft.graph.requests.UnifiedRoleManagementPolicyCollectionPage.class);
        }

        if (json.has("roleManagementPolicyAssignments")) {
            roleManagementPolicyAssignments = serializer.deserializeObject(json.get("roleManagementPolicyAssignments"), com.microsoft.graph.requests.UnifiedRoleManagementPolicyAssignmentCollectionPage.class);
        }
    }
}
