/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.waf.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because you tried to create, update, or delete an object by using a change token that has
 * already been used.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WAFStaleDataException extends com.amazonaws.services.waf.model.AWSWAFException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFStaleDataException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public WAFStaleDataException(String message) {
        super(message);
    }

}
