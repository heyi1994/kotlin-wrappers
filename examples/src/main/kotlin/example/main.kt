package example

import kotlinext.js.*
import react.*
import react.dom.*

fun RBuilder.app() {
    div {
        // Three different ways to define style properties are listed below
        attrs.jsStyle = js {
            width = "100px"
        }

        attrs {
            jsStyle {
                height = "100px"
            }
        }

        attrs.jsStyle.backgroundColor = "red"
    }
}
