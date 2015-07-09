/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codepipeline.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.service.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionConfigurationProperty JSON Unmarshaller
 */
public class ActionConfigurationPropertyJsonUnmarshaller implements
        Unmarshaller<ActionConfigurationProperty, JsonUnmarshallerContext> {

    public ActionConfigurationProperty unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        ActionConfigurationProperty actionConfigurationProperty = new ActionConfigurationProperty();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty.setName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("required", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty
                            .setRequired(BooleanJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty.setKey(BooleanJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("secret", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty
                            .setSecret(BooleanJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("queryable", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty
                            .setQueryable(BooleanJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty
                            .setDescription(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    actionConfigurationProperty.setType(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionConfigurationProperty;
    }

    private static ActionConfigurationPropertyJsonUnmarshaller instance;

    public static ActionConfigurationPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionConfigurationPropertyJsonUnmarshaller();
        return instance;
    }
}
