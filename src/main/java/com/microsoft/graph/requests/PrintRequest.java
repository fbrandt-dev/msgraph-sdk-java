// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Print;
import com.microsoft.graph.requests.PrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintConnectorRequestBuilder;
import com.microsoft.graph.requests.PrintOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintOperationRequestBuilder;
import com.microsoft.graph.requests.PrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.PrinterRequestBuilder;
import com.microsoft.graph.requests.PrintServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintServiceRequestBuilder;
import com.microsoft.graph.requests.PrinterShareCollectionRequestBuilder;
import com.microsoft.graph.requests.PrinterShareRequestBuilder;
import com.microsoft.graph.requests.PrintTaskDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintTaskDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Request.
 */
public class PrintRequest extends BaseRequest<Print> {
	
    /**
     * The request for the Print
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Print.class);
    }

    /**
     * Gets the Print from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Print> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Print from the service
     *
     * @return the Print from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Print get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Print> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Print delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Print with a source
     *
     * @param sourcePrint the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Print> patchAsync(@Nonnull final Print sourcePrint) {
        return sendAsync(HttpMethod.PATCH, sourcePrint);
    }

    /**
     * Patches this Print with a source
     *
     * @param sourcePrint the source object with updates
     * @return the updated Print
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Print patch(@Nonnull final Print sourcePrint) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Print> postAsync(@Nonnull final Print newPrint) {
        return sendAsync(HttpMethod.POST, newPrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the new object to create
     * @return the created Print
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Print post(@Nonnull final Print newPrint) throws ClientException {
        return send(HttpMethod.POST, newPrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Print> putAsync(@Nonnull final Print newPrint) {
        return sendAsync(HttpMethod.PUT, newPrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the object to create/update
     * @return the created Print
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Print put(@Nonnull final Print newPrint) throws ClientException {
        return send(HttpMethod.PUT, newPrint);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrintRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PrintRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

