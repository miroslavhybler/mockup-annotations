@file:Suppress(
    "RedundantVisibilityModifier",
    "RemoveEmptyPrimaryConstructor",
    "unused",
    "RedundantConstructorKeyword"
)

package com.mockup.annotations


/**
 * Annotates class's property to be skipped during generating mockup data.
 * @author Miroslav Hýbler<br>
 * created on 01.06.2024
 * @since 1.1.7
 */
@Target(
    allowedTargets = [
        AnnotationTarget.PROPERTY
    ]
)
@Retention(value= AnnotationRetention.SOURCE)
@MustBeDocumented
public annotation class IgnoreOnMockup constructor() {
}