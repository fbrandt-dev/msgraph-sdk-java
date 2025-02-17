// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Entity Type.
*/
public enum EntityType
{
    /**
    * event
    */
    EVENT,
    /**
    * message
    */
    MESSAGE,
    /**
    * drive Item
    */
    DRIVE_ITEM,
    /**
    * external Item
    */
    EXTERNAL_ITEM,
    /**
    * site
    */
    SITE,
    /**
    * list
    */
    LIST,
    /**
    * list Item
    */
    LIST_ITEM,
    /**
    * drive
    */
    DRIVE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * chat Message
    */
    CHAT_MESSAGE,
    /**
    * person
    */
    PERSON,
    /**
    * For EntityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
