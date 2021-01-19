// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.WorkbookFilterRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Request.
 */
public class WorkbookTableColumnRequest extends BaseRequest<WorkbookTableColumn> {
	
    /**
     * The request for the WorkbookTableColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableColumnRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableColumn.class);
    }

    /**
     * Gets the WorkbookTableColumn from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableColumn> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookTableColumn from the service
     *
     * @return the WorkbookTableColumn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableColumn get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableColumn> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookTableColumn delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookTableColumn with a source
     *
     * @param sourceWorkbookTableColumn the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableColumn> patchAsync(@Nonnull final WorkbookTableColumn sourceWorkbookTableColumn) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookTableColumn);
    }

    /**
     * Patches this WorkbookTableColumn with a source
     *
     * @param sourceWorkbookTableColumn the source object with updates
     * @return the updated WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableColumn patch(@Nonnull final WorkbookTableColumn sourceWorkbookTableColumn) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTableColumn);
    }

    /**
     * Creates a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableColumn> postAsync(@Nonnull final WorkbookTableColumn newWorkbookTableColumn) {
        return sendAsync(HttpMethod.POST, newWorkbookTableColumn);
    }

    /**
     * Creates a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the new object to create
     * @return the created WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableColumn post(@Nonnull final WorkbookTableColumn newWorkbookTableColumn) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTableColumn);
    }

    /**
     * Creates a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookTableColumn> putAsync(@Nonnull final WorkbookTableColumn newWorkbookTableColumn) {
        return sendAsync(HttpMethod.PUT, newWorkbookTableColumn);
    }

    /**
     * Creates a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the object to create/update
     * @return the created WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableColumn put(@Nonnull final WorkbookTableColumn newWorkbookTableColumn) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookTableColumn);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookTableColumnRequest select(@Nonnull final String value) {
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
     public WorkbookTableColumnRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

