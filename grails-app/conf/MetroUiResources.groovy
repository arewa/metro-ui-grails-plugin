def log = org.slf4j.LoggerFactory.getLogger('grails.plugins.metroui.BootstrapResources')
def dev = grails.util.GrailsUtil.isDevelopmentEnv()

def pluginManager = grails.util.Holders.pluginManager
def lesscssPlugin = pluginManager.getGrailsPlugin('lesscss-resources') || pluginManager.getGrailsPlugin('less-resources')
def jqueryPlugin = pluginManager.getGrailsPlugin('jquery')
def configDefaultBundle = grails.util.Holders.config.grails.plugins.metroui.defaultBundle
if (!configDefaultBundle && !configDefaultBundle.equals(false)) {
    configDefaultBundle = 'bundle_metro-ui'
}

def dirLessSource
def dirTarget

log.debug "dirLessSource: ${dirLessSource}"
log.debug "dirTarget: ${dirTarget}"

def cssFile = "metro-bootstrap.css"
def cssminFile = "metro-bootstrap.min.css"

log.debug "config: grails.plugins.metroui.defaultBundle = ${configDefaultBundle}"

log.debug "is lesscss-resources plugin loaded? ${!!lesscssPlugin}"
log.debug "is jquery plugin loaded? ${!!jqueryPlugin}"

modules = {
    'metro-ui-css' {
        defaultBundle configDefaultBundle

        resource id: 'metro-ui-css', url:[plugin: 'metro-ui', dir: 'css', file: (dev ? cssFile : cssminFile)], disposition: 'head', exclude:'minify'
    }

    'metro-ui-responsive-css' {
        resource id: 'metro-ui-responsive-css', url:[plugin: 'metro-ui', dir: 'css', file: (dev ? 'metro-bootstrap-responsive.css' : 'metro-bootstrap-responsive.min.css')], disposition: 'head', exclude:'minify'
    }

    'metro-accordion' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-accordion', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-accordion.js']
    }

    'metro-button-set' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-button-set', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-button-set.js']
    }

    'metro-calendar' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-calendar', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-calendar.js']
    }

    'metro-carousel' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-carousel', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-carousel.js']
    }

    'metro-core' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-core', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-core.js']
    }

    'metro-countdown' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-countdown', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-countdown.js']
    }

    'metro-date-format' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-date-format', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-date-format.js']
    }

    'metro-datepicker' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-datepicker', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-datepicker.js']
    }

    'metro-dialog' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-dialog', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-dialog.js']
    }

    'metro-drag-tile' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-drag-tile', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-drag-tile.js']
    }

    'metro-dropdown' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-dropdown', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-dropdown.js']
    }

    'metro-fluentmenu' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-fluentmenu', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-fluentmenu.js']
    }

    'metro-global' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-global', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-global.js']
    }

    'metro-hint' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-hint', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-hint.js']
    }

    'metro-initiator' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-initiator', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-initiator.js']
    }

    'metro-input-control' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-input-control', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-input-control.js']
    }

    'metro-listview' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-listview', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-listview.js']
    }

    'metro-live-tile' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-live-tile', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-live-tile.js']
    }

    'metro-loader' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-loader', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-loader.js']
    }

    'metro-locale' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-locale', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-locale.js']
    }

    'metro-notify' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-notify', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-notify.js']
    }

    'metro-panel' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-panel', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-panel.js']
    }

    'metro-plugin-template' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-plugin-template', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-plugin-template.js']
    }

    'metro-popover' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-popover', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-popover.js']
    }

    'metro-progressbar' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-progressbar', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-progressbar.js']
    }

    'metro-pull' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-pull', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-pull.js']
    }

    'metro-rating' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-rating', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-rating.js']
    }

    'metro-scroll' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-scroll', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-scroll.js']
    }

    'metro-slider' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-slider', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-slider.js']
    }

    'metro-stepper' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-stepper', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-stepper.js']
    }

    'metro-streamer' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-streamer', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-streamer.js']
    }

    'metro-tab-control' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-tab-control', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-tab-control.js']
    }

    'metro-table' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-table', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-table.js']
    }

    'metro-tile-transform' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-tile-transform', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-tile-transform.js']
    }

    'metro-times' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-times', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-times.js']
    }

    'metro-touch-handler' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-touch-handler', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-touch-handler.js']
    }

    'metro-treeview' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-treeview', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-treeview.js']
    }

    'metro-wizard' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }

        resource id: 'metro-wizard', url:[plugin: 'metro-ui', dir: 'js', file: 'metro-wizard.js']
    }

    'metro-ui-js' {
        defaultBundle configDefaultBundle
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }
        dependsOn 'metro-accordion,metro-button-set,metro-calendar,metro-carousel,metro-core,metro-countdown,metro-date-format,metro-datepicker,metro-dialog,metro-drag-tile,metro-dropdown,metro-fluentmenu,metro-global,metro-hint,metro-initiator,metro-input-control,metro-listview,metro-live-tile,metro-loader,metro-locale,metro-notify,metro-panel,metro-plugin-template,metro-popover,metro-progressbar,metro-pull,metro-rating,metro-scroll,metro-slider,metro-stepper,metro-streamer,metro-tab-control,metro-table,metro-tile-transform,metro-times,metro-touch-handler,metro-treeview,metro-wizard'
    }

    'metro-ui-less' {
        defaultBundle configDefaultBundle

        resource id:'metro-ui-less', url:[plugin: 'metro-ui', dir: 'less', file: 'metro-bootstrap.less'], attrs:[rel: "stylesheet/less", type:'css', order:100], disposition: 'head'
    }

    'metro-ui-responsive-less' {
        defaultBundle configDefaultBundle

        resource id:'metro-ui-responsive-less', url:[plugin: 'metro-ui', dir: 'less', file: 'metro-bootstrap-responsive.less'], attrs:[rel: "stylesheet/less", type:'css', order:100], disposition: 'head'
    }

    metro-ui {
        defaultBundle configDefaultBundle
        if (lesscssPlugin) {
            dependsOn 'metro-ui-less'
        } else {
            dependsOn 'metro-ui-css'
        }
        dependsOn 'metro-ui-js'
    }
}