/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2018, Ondrej Fischer
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package fluent.api;

/**
 * Dsl interface allowing chaining of method add(), but with required terminal method end().
 */
public class Dsl {

    /**
     * Field use in DSL chain.
     */
    public final Dsl field = this;

    /**
     * Method allowing chaining.
     *
     * @return The DSL to continue chaining.
     */
    public Dsl add() {
        return this;
    }

    /**
     * Terminal method, that needs to be invoked at the end of the chain.
     */
    @End
    public void end() {

    }

    /**
     * Another terminal method, that needs to be invoked at the end of the chain.
     */
    @End
    public Dsl cancel() {
        return this;
    }

    public Nested nested() {
        return null;
    }

    public void wrongEnd() {

    }

    public NestedAllowingEnd nestedAllowingEnd() {
        return null;
    }

    @End
    public Result result() {
        return null;
    }

    public static void accept(Dsl dsl) {

    }

    @Start("Missing parameters.")
    public static Parameter1 call() {
        return null;
    }

    interface Parameter1 {
        Parameter2 parameter1(int value);
    }

    interface Parameter2 {
        @End
        void parameter2(String value);
    }

}
