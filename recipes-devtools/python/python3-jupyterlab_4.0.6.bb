SUMMARY = "JupyterLab computational environment"
HOMEPAGE = "https://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3833c7b0556c7185b65b20af0b237965"

SRC_URI[sha256sum] = "6c43ae5a6a1fd2fdfafcb3454004958bde6da76331abb44cffc6f9e436b19ba1"

PYPI_PACKAGE = "jupyterlab"

DEPENDS += "\
    python3-hatch-jupyter-builder-native \
"
#    python3-jupyter-packaging-native 
#    python3-tomlkit-native 
#    python3-deprecation-native 

inherit pypi python_hatchling


RDEPENDS:${PN} = "\
    ${PYTHON_PN}-async-lru \
    ${PYTHON_PN}-ipykernel \
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-jupyter-lsp \
    ${PYTHON_PN}-jupyter-server \
    ${PYTHON_PN}-jupyterlab-server \
    ${PYTHON_PN}-matplotlib-inline \
    ${PYTHON_PN}-notebook-shim \
    ${PYTHON_PN}-packaging \
    ${PYTHON_PN}-sqlite3 \
    ${PYTHON_PN}-tornado \
    ${PYTHON_PN}-traitlets \
"

BBCLASSEXTEND = "native nativesdk"

FILES:${PN} += " \
  /usr/etc \
  /usr/etc/jupyter \
  /usr/etc/jupyter/jupyter_server_config.d \
  /usr/etc/jupyter/jupyter_notebook_config.d \
  /usr/etc/jupyter/jupyter_server_config.d/jupyterlab.json \
  /usr/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json \
  /usr/share/jupyter \
  /usr/share/icons \
  /usr/share/jupyter/lab \
  /usr/share/jupyter/lab/themes \
  /usr/share/jupyter/lab/schemas \
  /usr/share/jupyter/lab/static \
  /usr/share/jupyter/lab/themes/@jupyterlab \
  /usr/share/jupyter/lab/themes/@jupyterlab/theme-light-extension \
  /usr/share/jupyter/lab/themes/@jupyterlab/theme-dark-extension \
  /usr/share/jupyter/lab/themes/@jupyterlab/theme-light-extension/index.css \
  /usr/share/jupyter/lab/themes/@jupyterlab/theme-light-extension/index.js \
  /usr/share/jupyter/lab/themes/@jupyterlab/theme-dark-extension/index.css \
  /usr/share/jupyter/lab/themes/@jupyterlab/theme-dark-extension/index.js \
  /usr/share/jupyter/lab/schemas/@jupyterlab \
  /usr/share/jupyter/lab/schemas/@jupyterlab/running-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/toc-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/completer-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/help-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/imageviewer-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/terminal-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/codemirror-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/metadataform-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/tooltip-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/fileeditor-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/extensionmanager-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/cell-toolbar-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/hub-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/lsp-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/htmlviewer-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/launcher-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/documentsearch-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/console-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/debugger-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/translation-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/mainmenu-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/shortcuts-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/celltags-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/mathjax-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/csvviewer-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/settingeditor-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/markdownviewer-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/logconsole-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/docmanager-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/inspector-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/statusbar-extension \
  /usr/share/jupyter/lab/schemas/@jupyterlab/running-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/running-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/toc-extension/registry.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/toc-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/completer-extension/manager.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/completer-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/help-extension/about.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/help-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/help-extension/jupyter-forum.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/help-extension/launch-classic.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/imageviewer-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/imageviewer-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/terminal-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/terminal-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/codemirror-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/codemirror-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/metadataform-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/metadataform-extension/metadataforms.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/tooltip-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/tooltip-extension/notebooks.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/tooltip-extension/files.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/tooltip-extension/consoles.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/fileeditor-extension/completer.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/fileeditor-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/fileeditor-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension/download.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension/open-browser-tab.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension/open-with.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension/widget.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/filebrowser-extension/browser.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/extensionmanager-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/extensionmanager-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/cell-toolbar-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/cell-toolbar-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/hub-extension/menu.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/hub-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/lsp-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/lsp-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/htmlviewer-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/htmlviewer-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/launcher-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/launcher-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/documentsearch-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/documentsearch-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/console-extension/foreign.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/console-extension/completer.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/console-extension/tracker.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/console-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/debugger-extension/main.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/debugger-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/translation-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/translation-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/mainmenu-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/mainmenu-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/shortcuts-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/shortcuts-extension/shortcuts.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/celltags-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/celltags-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/mathjax-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/mathjax-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/print.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/sanitizer.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/workspaces.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/palette.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/utilityCommands.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/notification.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/apputils-extension/themes.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension/shell.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension/commands.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension/context-menu.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension/property-inspector.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/application-extension/top-bar.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/csvviewer-extension/csv.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/csvviewer-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/csvviewer-extension/tsv.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/settingeditor-extension/form-ui.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/settingeditor-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/settingeditor-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/markdownviewer-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/markdownviewer-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension/export.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension/panel.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension/completer.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension/tracker.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/notebook-extension/tools.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/logconsole-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/logconsole-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/docmanager-extension/download.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/docmanager-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/docmanager-extension/plugin.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/inspector-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/inspector-extension/notebooks.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/inspector-extension/inspector.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/inspector-extension/consoles.json \
  /usr/share/jupyter/lab/schemas/@jupyterlab/statusbar-extension/package.json.orig \
  /usr/share/jupyter/lab/schemas/@jupyterlab/statusbar-extension/plugin.json \
  /usr/share/jupyter/lab/static/style.js \
  /usr/share/jupyter/lab/static/build_log.json \
  /usr/share/jupyter/lab/static/bootstrap.js \
  /usr/share/jupyter/lab/static/*.ttf \
  /usr/share/jupyter/lab/static/*.eot \
  /usr/share/jupyter/lab/static/third-party-licenses.json \
  /usr/share/jupyter/lab/static/*.js \
  /usr/share/jupyter/lab/static/*.js.LICENSE.txt \
  /usr/share/jupyter/lab/static/*.svg \
  /usr/share/jupyter/lab/static/*.woff \
  /usr/share/jupyter/lab/static/*.woff2 \
  /usr/share/jupyter/lab/static/package.json \
  /usr/share/jupyter/lab/static/index.html \
  /usr/share/jupyter/lab/static/index.out.js \
  /usr/share/icons/hicolor \
  /usr/share/icons/hicolor/scalable \
  /usr/share/icons/hicolor/scalable/apps \
  /usr/share/icons/hicolor/scalable/apps/jupyterlab.svg \
"