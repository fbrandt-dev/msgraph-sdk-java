// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookRange;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Total Row Range Parameter Set.
 */
public class WorkbookTableColumnTotalRowRangeParameterSet {

    /**
     * Instiaciates a new WorkbookTableColumnTotalRowRangeParameterSet
     */
    public WorkbookTableColumnTotalRowRangeParameterSet() {}
    /**
     * Instiaciates a new WorkbookTableColumnTotalRowRangeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookTableColumnTotalRowRangeParameterSet(@Nonnull final WorkbookTableColumnTotalRowRangeParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookTableColumnTotalRowRangeParameterSetBuilder newBuilder() {
        return new WorkbookTableColumnTotalRowRangeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookTableColumnTotalRowRangeParameterSet
     */
    public static final class WorkbookTableColumnTotalRowRangeParameterSetBuilder {
        /**
         * Instanciates a new WorkbookTableColumnTotalRowRangeParameterSetBuilder
         */
        @Nullable
        protected WorkbookTableColumnTotalRowRangeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookTableColumnTotalRowRangeParameterSet build() {
            return new WorkbookTableColumnTotalRowRangeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
