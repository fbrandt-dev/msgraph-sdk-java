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
import com.microsoft.graph.models.EntitlementManagementSettings;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ApprovalCollectionPage;
import com.microsoft.graph.requests.AccessPackageCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentCollectionPage;
import com.microsoft.graph.requests.AccessPackageCatalogCollectionPage;
import com.microsoft.graph.requests.ConnectedOrganizationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entitlement Management.
 */
public class EntitlementManagement extends Entity implements IJsonBackedObject {


    /**
     * The Access Package Assignment Approvals.
     * Approval stages for decisions associated with access package assignment requests.
     */
    @SerializedName(value = "accessPackageAssignmentApprovals", alternate = {"AccessPackageAssignmentApprovals"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ApprovalCollectionPage accessPackageAssignmentApprovals;

    /**
     * The Access Packages.
     * Access packages define the collection of resource roles and the policies for which subjects can request or be assigned access to those resources.
     */
    @SerializedName(value = "accessPackages", alternate = {"AccessPackages"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageCollectionPage accessPackages;

    /**
     * The Assignment Policies.
     * Access package assignment policies govern which subjects can request or be assigned an access package via an access package assignment.
     */
    @SerializedName(value = "assignmentPolicies", alternate = {"AssignmentPolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionPage assignmentPolicies;

    /**
     * The Assignment Requests.
     * Access package assignment requests created by or on behalf of a subject.
     */
    @SerializedName(value = "assignmentRequests", alternate = {"AssignmentRequests"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageAssignmentRequestCollectionPage assignmentRequests;

    /**
     * The Assignments.
     * The assignment of an access package to a subject for a period of time.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageAssignmentCollectionPage assignments;

    /**
     * The Catalogs.
     * A container for access packages.
     */
    @SerializedName(value = "catalogs", alternate = {"Catalogs"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AccessPackageCatalogCollectionPage catalogs;

    /**
     * The Connected Organizations.
     * References to a directory or domain of another organization whose users can request access.
     */
    @SerializedName(value = "connectedOrganizations", alternate = {"ConnectedOrganizations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ConnectedOrganizationCollectionPage connectedOrganizations;

    /**
     * The Settings.
     * The settings that control the behavior of Azure AD entitlement management.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public EntitlementManagementSettings settings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("accessPackageAssignmentApprovals")) {
            accessPackageAssignmentApprovals = serializer.deserializeObject(json.get("accessPackageAssignmentApprovals"), com.microsoft.graph.requests.ApprovalCollectionPage.class);
        }

        if (json.has("accessPackages")) {
            accessPackages = serializer.deserializeObject(json.get("accessPackages"), com.microsoft.graph.requests.AccessPackageCollectionPage.class);
        }

        if (json.has("assignmentPolicies")) {
            assignmentPolicies = serializer.deserializeObject(json.get("assignmentPolicies"), com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionPage.class);
        }

        if (json.has("assignmentRequests")) {
            assignmentRequests = serializer.deserializeObject(json.get("assignmentRequests"), com.microsoft.graph.requests.AccessPackageAssignmentRequestCollectionPage.class);
        }

        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), com.microsoft.graph.requests.AccessPackageAssignmentCollectionPage.class);
        }

        if (json.has("catalogs")) {
            catalogs = serializer.deserializeObject(json.get("catalogs"), com.microsoft.graph.requests.AccessPackageCatalogCollectionPage.class);
        }

        if (json.has("connectedOrganizations")) {
            connectedOrganizations = serializer.deserializeObject(json.get("connectedOrganizations"), com.microsoft.graph.requests.ConnectedOrganizationCollectionPage.class);
        }
    }
}
