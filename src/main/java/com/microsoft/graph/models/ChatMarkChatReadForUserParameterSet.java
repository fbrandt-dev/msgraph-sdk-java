// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.TeamworkUserIdentity;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Mark Chat Read For User Parameter Set.
 */
public class ChatMarkChatReadForUserParameterSet {
    /**
     * The user.
     * 
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
	@Nullable
    public TeamworkUserIdentity user;


    /**
     * Instiaciates a new ChatMarkChatReadForUserParameterSet
     */
    public ChatMarkChatReadForUserParameterSet() {}
    /**
     * Instiaciates a new ChatMarkChatReadForUserParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ChatMarkChatReadForUserParameterSet(@Nonnull final ChatMarkChatReadForUserParameterSetBuilder builder) {
        this.user = builder.user;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ChatMarkChatReadForUserParameterSetBuilder newBuilder() {
        return new ChatMarkChatReadForUserParameterSetBuilder();
    }
    /**
     * Fluent builder for the ChatMarkChatReadForUserParameterSet
     */
    public static final class ChatMarkChatReadForUserParameterSetBuilder {
        /**
         * The user parameter value
         */
        @Nullable
        protected TeamworkUserIdentity user;
        /**
         * Sets the User
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ChatMarkChatReadForUserParameterSetBuilder withUser(@Nullable final TeamworkUserIdentity val) {
            this.user = val;
            return this;
        }
        /**
         * Instanciates a new ChatMarkChatReadForUserParameterSetBuilder
         */
        @Nullable
        protected ChatMarkChatReadForUserParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ChatMarkChatReadForUserParameterSet build() {
            return new ChatMarkChatReadForUserParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.user != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("user", user));
        }
        return result;
    }
}
