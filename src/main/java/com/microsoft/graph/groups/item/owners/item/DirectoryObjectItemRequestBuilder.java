package com.microsoft.graph.groups.item.owners.item;

import com.microsoft.graph.groups.item.owners.item.application.ApplicationRequestBuilder;
import com.microsoft.graph.groups.item.owners.item.device.DeviceRequestBuilder;
import com.microsoft.graph.groups.item.owners.item.group.GroupRequestBuilder;
import com.microsoft.graph.groups.item.owners.item.orgcontact.OrgContactRequestBuilder;
import com.microsoft.graph.groups.item.owners.item.ref.RefRequestBuilder;
import com.microsoft.graph.groups.item.owners.item.serviceprincipal.ServicePrincipalRequestBuilder;
import com.microsoft.graph.groups.item.owners.item.user.UserRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/** Builds and executes requests for operations under /groups/{group-id}/owners/{directoryObject-id} */
public class DirectoryObjectItemRequestBuilder {
    /** Casts the previous resource to application. */
    @javax.annotation.Nonnull
    public ApplicationRequestBuilder application() {
        return new ApplicationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to device. */
    @javax.annotation.Nonnull
    public DeviceRequestBuilder device() {
        return new DeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to group. */
    @javax.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /** Casts the previous resource to orgContact. */
    @javax.annotation.Nonnull
    public OrgContactRequestBuilder orgContact() {
        return new OrgContactRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the collection of group entities. */
    @javax.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Casts the previous resource to servicePrincipal. */
    @javax.annotation.Nonnull
    public ServicePrincipalRequestBuilder servicePrincipal() {
        return new ServicePrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Casts the previous resource to user. */
    @javax.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/groups/{group%2Did}/owners/{directoryObject%2Did}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/groups/{group%2Did}/owners/{directoryObject%2Did}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}
