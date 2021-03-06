package uy.kohesive.kovert.template.handlebars

import com.github.jknack.handlebars.Handlebars
import uy.klutter.core.common.mustNotEndWith
import uy.kohesive.kovert.core.TemplateEngine


class KovertHandlebarsTemplateEngine(val handlebars: Handlebars) : TemplateEngine {
    override fun render(template: String, model: Any): String {
        val compiledTemplate = handlebars.compile(template.mustNotEndWith(handlebars.loader.suffix))
        return compiledTemplate.apply(model)
    }
}