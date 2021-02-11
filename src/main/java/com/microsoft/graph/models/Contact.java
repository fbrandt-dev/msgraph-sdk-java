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
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.EmailAddress;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.ProfilePhoto;
import com.microsoft.graph.models.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.OutlookItem;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact.
 */
public class Contact extends OutlookItem implements IJsonBackedObject {


    /**
     * The Assistant Name.
     * The name of the contact's assistant.
     */
    @SerializedName(value = "assistantName", alternate = {"AssistantName"})
    @Expose
	@Nullable
    public String assistantName;

    /**
     * The Birthday.
     * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime birthday;

    /**
     * The Business Address.
     * The contact's business address.
     */
    @SerializedName(value = "businessAddress", alternate = {"BusinessAddress"})
    @Expose
	@Nullable
    public PhysicalAddress businessAddress;

    /**
     * The Business Home Page.
     * The business home page of the contact.
     */
    @SerializedName(value = "businessHomePage", alternate = {"BusinessHomePage"})
    @Expose
	@Nullable
    public String businessHomePage;

    /**
     * The Business Phones.
     * The contact's business phone numbers.
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
	@Nullable
    public java.util.List<String> businessPhones;

    /**
     * The Children.
     * The names of the contact's children.
     */
    @SerializedName(value = "children", alternate = {"Children"})
    @Expose
	@Nullable
    public java.util.List<String> children;

    /**
     * The Company Name.
     * The name of the contact's company.
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
	@Nullable
    public String companyName;

    /**
     * The Department.
     * The contact's department.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
	@Nullable
    public String department;

    /**
     * The Display Name.
     * The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email Addresses.
     * The contact's email addresses.
     */
    @SerializedName(value = "emailAddresses", alternate = {"EmailAddresses"})
    @Expose
	@Nullable
    public java.util.List<EmailAddress> emailAddresses;

    /**
     * The File As.
     * The name the contact is filed under.
     */
    @SerializedName(value = "fileAs", alternate = {"FileAs"})
    @Expose
	@Nullable
    public String fileAs;

    /**
     * The Generation.
     * The contact's generation.
     */
    @SerializedName(value = "generation", alternate = {"Generation"})
    @Expose
	@Nullable
    public String generation;

    /**
     * The Given Name.
     * The contact's given name.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Home Address.
     * The contact's home address.
     */
    @SerializedName(value = "homeAddress", alternate = {"HomeAddress"})
    @Expose
	@Nullable
    public PhysicalAddress homeAddress;

    /**
     * The Home Phones.
     * The contact's home phone numbers.
     */
    @SerializedName(value = "homePhones", alternate = {"HomePhones"})
    @Expose
	@Nullable
    public java.util.List<String> homePhones;

    /**
     * The Im Addresses.
     * The contact's instant messaging (IM) addresses.
     */
    @SerializedName(value = "imAddresses", alternate = {"ImAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> imAddresses;

    /**
     * The Initials.
     * The contact's initials.
     */
    @SerializedName(value = "initials", alternate = {"Initials"})
    @Expose
	@Nullable
    public String initials;

    /**
     * The Job Title.
     * The contact’s job title.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Manager.
     * The name of the contact's manager.
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
	@Nullable
    public String manager;

    /**
     * The Middle Name.
     * The contact's middle name.
     */
    @SerializedName(value = "middleName", alternate = {"MiddleName"})
    @Expose
	@Nullable
    public String middleName;

    /**
     * The Mobile Phone.
     * The contact's mobile phone number.
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
	@Nullable
    public String mobilePhone;

    /**
     * The Nick Name.
     * The contact's nickname.
     */
    @SerializedName(value = "nickName", alternate = {"NickName"})
    @Expose
	@Nullable
    public String nickName;

    /**
     * The Office Location.
     * The location of the contact's office.
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
	@Nullable
    public String officeLocation;

    /**
     * The Other Address.
     * Other addresses for the contact.
     */
    @SerializedName(value = "otherAddress", alternate = {"OtherAddress"})
    @Expose
	@Nullable
    public PhysicalAddress otherAddress;

    /**
     * The Parent Folder Id.
     * The ID of the contact's parent folder.
     */
    @SerializedName(value = "parentFolderId", alternate = {"ParentFolderId"})
    @Expose
	@Nullable
    public String parentFolderId;

    /**
     * The Personal Notes.
     * The user's notes about the contact.
     */
    @SerializedName(value = "personalNotes", alternate = {"PersonalNotes"})
    @Expose
	@Nullable
    public String personalNotes;

    /**
     * The Profession.
     * The contact's profession.
     */
    @SerializedName(value = "profession", alternate = {"Profession"})
    @Expose
	@Nullable
    public String profession;

    /**
     * The Spouse Name.
     * The name of the contact's spouse/partner.
     */
    @SerializedName(value = "spouseName", alternate = {"SpouseName"})
    @Expose
	@Nullable
    public String spouseName;

    /**
     * The Surname.
     * The contact's surname.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The Title.
     * The contact's title.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Yomi Company Name.
     * The phonetic Japanese company name of the contact.
     */
    @SerializedName(value = "yomiCompanyName", alternate = {"YomiCompanyName"})
    @Expose
	@Nullable
    public String yomiCompanyName;

    /**
     * The Yomi Given Name.
     * The phonetic Japanese given name (first name) of the contact.
     */
    @SerializedName(value = "yomiGivenName", alternate = {"YomiGivenName"})
    @Expose
	@Nullable
    public String yomiGivenName;

    /**
     * The Yomi Surname.
     * The phonetic Japanese surname (last name)  of the contact.
     */
    @SerializedName(value = "yomiSurname", alternate = {"YomiSurname"})
    @Expose
	@Nullable
    public String yomiSurname;

    /**
     * The Extensions.
     * The collection of open extensions defined for the contact. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
	@Nullable
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Photo.
     * Optional contact picture. You can get or set a photo for a contact.
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public ProfilePhoto photo;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
	@Nullable
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties"), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties"), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
