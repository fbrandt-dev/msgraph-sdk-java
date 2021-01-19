// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Hosted Content Request.
 */
public class ChatMessageHostedContentRequest extends BaseRequest<ChatMessageHostedContent> {
	
    /**
     * The request for the ChatMessageHostedContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageHostedContentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatMessageHostedContent.class);
    }

    /**
     * Gets the ChatMessageHostedContent from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChatMessageHostedContent> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ChatMessageHostedContent from the service
     *
     * @return the ChatMessageHostedContent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChatMessageHostedContent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChatMessageHostedContent> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ChatMessageHostedContent delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ChatMessageHostedContent with a source
     *
     * @param sourceChatMessageHostedContent the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChatMessageHostedContent> patchAsync(@Nonnull final ChatMessageHostedContent sourceChatMessageHostedContent) {
        return sendAsync(HttpMethod.PATCH, sourceChatMessageHostedContent);
    }

    /**
     * Patches this ChatMessageHostedContent with a source
     *
     * @param sourceChatMessageHostedContent the source object with updates
     * @return the updated ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChatMessageHostedContent patch(@Nonnull final ChatMessageHostedContent sourceChatMessageHostedContent) throws ClientException {
        return send(HttpMethod.PATCH, sourceChatMessageHostedContent);
    }

    /**
     * Creates a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChatMessageHostedContent> postAsync(@Nonnull final ChatMessageHostedContent newChatMessageHostedContent) {
        return sendAsync(HttpMethod.POST, newChatMessageHostedContent);
    }

    /**
     * Creates a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the new object to create
     * @return the created ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChatMessageHostedContent post(@Nonnull final ChatMessageHostedContent newChatMessageHostedContent) throws ClientException {
        return send(HttpMethod.POST, newChatMessageHostedContent);
    }

    /**
     * Creates a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ChatMessageHostedContent> putAsync(@Nonnull final ChatMessageHostedContent newChatMessageHostedContent) {
        return sendAsync(HttpMethod.PUT, newChatMessageHostedContent);
    }

    /**
     * Creates a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the object to create/update
     * @return the created ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ChatMessageHostedContent put(@Nonnull final ChatMessageHostedContent newChatMessageHostedContent) throws ClientException {
        return send(HttpMethod.PUT, newChatMessageHostedContent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ChatMessageHostedContentRequest select(@Nonnull final String value) {
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
     public ChatMessageHostedContentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

