// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Directory Synchronization Feature.
 */
public class OnPremisesDirectorySynchronizationFeature implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Block Cloud Object Takeover Through Hard Match Enabled.
     * Used to block cloud object takeover via source anchor hard match if enabled.
     */
    @SerializedName(value = "blockCloudObjectTakeoverThroughHardMatchEnabled", alternate = {"BlockCloudObjectTakeoverThroughHardMatchEnabled"})
    @Expose
	@Nullable
    public Boolean blockCloudObjectTakeoverThroughHardMatchEnabled;

    /**
     * The Block Soft Match Enabled.
     * Use to block soft match for all objects if enabled for the  tenant. Customers are encouraged to enable this feature and keep it enabled until soft matching is required again for their tenancy. This flag should be enabled again after any soft matching has been completed and is no longer needed.
     */
    @SerializedName(value = "blockSoftMatchEnabled", alternate = {"BlockSoftMatchEnabled"})
    @Expose
	@Nullable
    public Boolean blockSoftMatchEnabled;

    /**
     * The Bypass Dir Sync Overrides Enabled.
     * When true, persists the values of Mobile and OtherMobile in on-premises AD during sync cycles instead of values of MobilePhone or AlternateMobilePhones in Azure AD.
     */
    @SerializedName(value = "bypassDirSyncOverridesEnabled", alternate = {"BypassDirSyncOverridesEnabled"})
    @Expose
	@Nullable
    public Boolean bypassDirSyncOverridesEnabled;

    /**
     * The Cloud Password Policy For Password Synced Users Enabled.
     * Used to indicate that cloud password policy applies to users whose passwords are synchronized from on-premises.
     */
    @SerializedName(value = "cloudPasswordPolicyForPasswordSyncedUsersEnabled", alternate = {"CloudPasswordPolicyForPasswordSyncedUsersEnabled"})
    @Expose
	@Nullable
    public Boolean cloudPasswordPolicyForPasswordSyncedUsersEnabled;

    /**
     * The Concurrent Credential Update Enabled.
     * Used to enable concurrent user credentials update in OrgId.
     */
    @SerializedName(value = "concurrentCredentialUpdateEnabled", alternate = {"ConcurrentCredentialUpdateEnabled"})
    @Expose
	@Nullable
    public Boolean concurrentCredentialUpdateEnabled;

    /**
     * The Concurrent Org Id Provisioning Enabled.
     * Used to enable concurrent user creation in OrgId.
     */
    @SerializedName(value = "concurrentOrgIdProvisioningEnabled", alternate = {"ConcurrentOrgIdProvisioningEnabled"})
    @Expose
	@Nullable
    public Boolean concurrentOrgIdProvisioningEnabled;

    /**
     * The Device Writeback Enabled.
     * Used to indicate that device write-back is enabled.
     */
    @SerializedName(value = "deviceWritebackEnabled", alternate = {"DeviceWritebackEnabled"})
    @Expose
	@Nullable
    public Boolean deviceWritebackEnabled;

    /**
     * The Directory Extensions Enabled.
     * Used to indicate that directory extensions are being synced from on-premises AD to Azure AD.
     */
    @SerializedName(value = "directoryExtensionsEnabled", alternate = {"DirectoryExtensionsEnabled"})
    @Expose
	@Nullable
    public Boolean directoryExtensionsEnabled;

    /**
     * The Fope Conflict Resolution Enabled.
     * Used to indicate that for a Microsoft Forefront Online Protection for Exchange (FOPE) migrated tenant, the conflicting proxy address should be migrated over.
     */
    @SerializedName(value = "fopeConflictResolutionEnabled", alternate = {"FopeConflictResolutionEnabled"})
    @Expose
	@Nullable
    public Boolean fopeConflictResolutionEnabled;

    /**
     * The Group Write Back Enabled.
     * Used to enable object-level group writeback feature for additional group types.
     */
    @SerializedName(value = "groupWriteBackEnabled", alternate = {"GroupWriteBackEnabled"})
    @Expose
	@Nullable
    public Boolean groupWriteBackEnabled;

    /**
     * The Password Sync Enabled.
     * Used to indicate on-premise password synchronization is enabled.
     */
    @SerializedName(value = "passwordSyncEnabled", alternate = {"PasswordSyncEnabled"})
    @Expose
	@Nullable
    public Boolean passwordSyncEnabled;

    /**
     * The Password Writeback Enabled.
     * Used to indicate that writeback of password resets from Azure AD to on-premises AD is enabled.
     */
    @SerializedName(value = "passwordWritebackEnabled", alternate = {"PasswordWritebackEnabled"})
    @Expose
	@Nullable
    public Boolean passwordWritebackEnabled;

    /**
     * The Quarantine Upon Proxy Addresses Conflict Enabled.
     * Used to indicate that we should quarantine objects with conflicting proxy address.
     */
    @SerializedName(value = "quarantineUponProxyAddressesConflictEnabled", alternate = {"QuarantineUponProxyAddressesConflictEnabled"})
    @Expose
	@Nullable
    public Boolean quarantineUponProxyAddressesConflictEnabled;

    /**
     * The Quarantine Upon Upn Conflict Enabled.
     * Used to indicate that we should quarantine objects conflicting with duplicate userPrincipalName.
     */
    @SerializedName(value = "quarantineUponUpnConflictEnabled", alternate = {"QuarantineUponUpnConflictEnabled"})
    @Expose
	@Nullable
    public Boolean quarantineUponUpnConflictEnabled;

    /**
     * The Soft Match On Upn Enabled.
     * Used to indicate that we should soft match objects based on userPrincipalName.
     */
    @SerializedName(value = "softMatchOnUpnEnabled", alternate = {"SoftMatchOnUpnEnabled"})
    @Expose
	@Nullable
    public Boolean softMatchOnUpnEnabled;

    /**
     * The Synchronize Upn For Managed Users Enabled.
     * Used to indicate that we should synchronize userPrincipalName objects for managed users with licenses.
     */
    @SerializedName(value = "synchronizeUpnForManagedUsersEnabled", alternate = {"SynchronizeUpnForManagedUsersEnabled"})
    @Expose
	@Nullable
    public Boolean synchronizeUpnForManagedUsersEnabled;

    /**
     * The Unified Group Writeback Enabled.
     * Used to indicate that Microsoft 365 Group write-back is enabled.
     */
    @SerializedName(value = "unifiedGroupWritebackEnabled", alternate = {"UnifiedGroupWritebackEnabled"})
    @Expose
	@Nullable
    public Boolean unifiedGroupWritebackEnabled;

    /**
     * The User Force Password Change On Logon Enabled.
     * Used to indicate that feature to force password change for a user on logon is enabled while synchronizing on-premise credentials.
     */
    @SerializedName(value = "userForcePasswordChangeOnLogonEnabled", alternate = {"UserForcePasswordChangeOnLogonEnabled"})
    @Expose
	@Nullable
    public Boolean userForcePasswordChangeOnLogonEnabled;

    /**
     * The User Writeback Enabled.
     * Used to indicate that user writeback is enabled.
     */
    @SerializedName(value = "userWritebackEnabled", alternate = {"UserWritebackEnabled"})
    @Expose
	@Nullable
    public Boolean userWritebackEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
