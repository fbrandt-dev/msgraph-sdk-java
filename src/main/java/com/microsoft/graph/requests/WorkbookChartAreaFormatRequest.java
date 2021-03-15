// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartAreaFormat;
import com.microsoft.graph.requests.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartFontRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Area Format Request.
 */
public class WorkbookChartAreaFormatRequest extends BaseRequest<WorkbookChartAreaFormat> {
	
    /**
     * The request for the WorkbookChartAreaFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAreaFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAreaFormat.class);
    }

    /**
     * Gets the WorkbookChartAreaFormat from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAreaFormat> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartAreaFormat from the service
     *
     * @return the WorkbookChartAreaFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAreaFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAreaFormat> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartAreaFormat delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartAreaFormat with a source
     *
     * @param sourceWorkbookChartAreaFormat the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAreaFormat> patchAsync(@Nonnull final WorkbookChartAreaFormat sourceWorkbookChartAreaFormat) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartAreaFormat);
    }

    /**
     * Patches this WorkbookChartAreaFormat with a source
     *
     * @param sourceWorkbookChartAreaFormat the source object with updates
     * @return the updated WorkbookChartAreaFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAreaFormat patch(@Nonnull final WorkbookChartAreaFormat sourceWorkbookChartAreaFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAreaFormat);
    }

    /**
     * Creates a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAreaFormat> postAsync(@Nonnull final WorkbookChartAreaFormat newWorkbookChartAreaFormat) {
        return sendAsync(HttpMethod.POST, newWorkbookChartAreaFormat);
    }

    /**
     * Creates a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the new object to create
     * @return the created WorkbookChartAreaFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAreaFormat post(@Nonnull final WorkbookChartAreaFormat newWorkbookChartAreaFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAreaFormat);
    }

    /**
     * Creates a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartAreaFormat> putAsync(@Nonnull final WorkbookChartAreaFormat newWorkbookChartAreaFormat) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartAreaFormat);
    }

    /**
     * Creates a WorkbookChartAreaFormat with a new object
     *
     * @param newWorkbookChartAreaFormat the object to create/update
     * @return the created WorkbookChartAreaFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAreaFormat put(@Nonnull final WorkbookChartAreaFormat newWorkbookChartAreaFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAreaFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartAreaFormatRequest select(@Nonnull final String value) {
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
     public WorkbookChartAreaFormatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

