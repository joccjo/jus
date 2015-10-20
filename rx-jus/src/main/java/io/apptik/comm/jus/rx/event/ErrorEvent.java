/*
 * Copyright (C) 2015 AppTik Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apptik.comm.jus.rx.event;


import io.apptik.comm.jus.Request;
import io.apptik.comm.jus.error.JusError;

/**
 * General event signal that may contain a request, response and message desctribing the event
 */
public final class ErrorEvent extends JusEvent {

    //error
    public final JusError error;

    public ErrorEvent(Request request, JusError error) {
        super(request);
        this.error = error;
    }

    @Override
    public String toString() {
        return "ErrorEvent{" +
                "request=" + request +
                ", error=" + error +
                "} ";
    }
}