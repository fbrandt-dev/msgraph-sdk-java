// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Values Filter Parameter Set.
 */
public class WorkbookFilterApplyValuesFilterParameterSet {
    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;


    /**
     * Instiaciates a new WorkbookFilterApplyValuesFilterParameterSet
     */
    public WorkbookFilterApplyValuesFilterParameterSet() {}
    /**
     * Instiaciates a new WorkbookFilterApplyValuesFilterParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFilterApplyValuesFilterParameterSet(@Nonnull final WorkbookFilterApplyValuesFilterParameterSetBuilder builder) {
        this.values = builder.values;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyValuesFilterParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyValuesFilterParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyValuesFilterParameterSet
     */
    public static final class WorkbookFilterApplyValuesFilterParameterSetBuilder {
        /**
         * The values parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyValuesFilterParameterSetBuilder withValues(@Nullable final com.google.gson.JsonElement val) {
            this.values = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFilterApplyValuesFilterParameterSetBuilder
         */
        @Nullable
        protected WorkbookFilterApplyValuesFilterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyValuesFilterParameterSet build() {
            return new WorkbookFilterApplyValuesFilterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
        }
        return result;
    }
}
