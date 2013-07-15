//
//  ========================================================================
//  Copyright (c) 1995-2013 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.jsr356.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class StackUtil
{
    public static String toString(Throwable t)
    {
        try (StringWriter w = new StringWriter())
        {
            try (PrintWriter out = new PrintWriter(w))
            {
                t.printStackTrace(out);
                return w.toString();
            }
        }
        catch (IOException e)
        {
            return "Unable to get stacktrace for: " + t;
        }
    }
}