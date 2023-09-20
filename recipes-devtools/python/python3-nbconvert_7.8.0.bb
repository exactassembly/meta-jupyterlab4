
SUMMARY = "Converting Jupyter Notebooks"
HOMEPAGE = "https://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

SRC_URI[sha256sum] = "f5bc15a1247e14dd41ceef0c0a3bc70020e016576eb0578da62f1c5b4f950479"

PYPI_PACKAGE = "nbconvert"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-beautifulsoup4 \
    ${PYTHON_PN}-bleach \
    ${PYTHON_PN}-defusedxml \
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-jupyterlab-pygments \
    ${PYTHON_PN}-markupsafe \
    ${PYTHON_PN}-mistune \
    ${PYTHON_PN}-nbclient\
    ${PYTHON_PN}-nbformat \
    ${PYTHON_PN}-packaging \
    ${PYTHON_PN}-pandocfilters \
    ${PYTHON_PN}-pygments \
    ${PYTHON_PN}-tinycss2 \
    ${PYTHON_PN}-traitlets \
"

FILES:${PN} += "\
  /usr/share \
  /usr/share/jupyter \
  /usr/share/jupyter/nbconvert \
  /usr/share/jupyter/nbconvert/templates \
  /usr/share/jupyter/nbconvert/templates/webpdf \
  /usr/share/jupyter/nbconvert/templates/markdown \
  /usr/share/jupyter/nbconvert/templates/latex \
  /usr/share/jupyter/nbconvert/templates/basic \
  /usr/share/jupyter/nbconvert/templates/asciidoc \
  /usr/share/jupyter/nbconvert/templates/compatibility \
  /usr/share/jupyter/nbconvert/templates/base \
  /usr/share/jupyter/nbconvert/templates/lab \
  /usr/share/jupyter/nbconvert/templates/script \
  /usr/share/jupyter/nbconvert/templates/classic \
  /usr/share/jupyter/nbconvert/templates/reveal \
  /usr/share/jupyter/nbconvert/templates/rst \
  /usr/share/jupyter/nbconvert/templates/python \
  /usr/share/jupyter/nbconvert/templates/webpdf/index.pdf.j2 \
  /usr/share/jupyter/nbconvert/templates/webpdf/conf.json \
  /usr/share/jupyter/nbconvert/templates/markdown/index.md.j2 \
  /usr/share/jupyter/nbconvert/templates/markdown/conf.json \
  /usr/share/jupyter/nbconvert/templates/latex/null.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/style_python.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/style_ipython.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/display_priority.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/style_jupyter.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/document_contents.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/base.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/style_bw_python.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/style_bw_ipython.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/conf.json \
  /usr/share/jupyter/nbconvert/templates/latex/report.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/latex/index.tex.j2 \
  /usr/share/jupyter/nbconvert/templates/basic/index.html.j2 \
  /usr/share/jupyter/nbconvert/templates/basic/conf.json \
  /usr/share/jupyter/nbconvert/templates/asciidoc/index.asciidoc.j2 \
  /usr/share/jupyter/nbconvert/templates/asciidoc/conf.json \
  /usr/share/jupyter/nbconvert/templates/compatibility/full.tpl \
  /usr/share/jupyter/nbconvert/templates/compatibility/display_priority.tpl \
  /usr/share/jupyter/nbconvert/templates/base/null.j2 \
  /usr/share/jupyter/nbconvert/templates/base/cell_id_anchor.j2 \
  /usr/share/jupyter/nbconvert/templates/base/jupyter_widgets.html.j2 \
  /usr/share/jupyter/nbconvert/templates/base/mathjax.html.j2 \
  /usr/share/jupyter/nbconvert/templates/base/celltags.j2 \
  /usr/share/jupyter/nbconvert/templates/base/display_priority.j2 \
  /usr/share/jupyter/nbconvert/templates/lab/mermaidjs.html.j2 \
  /usr/share/jupyter/nbconvert/templates/lab/base.html.j2 \
  /usr/share/jupyter/nbconvert/templates/lab/index.html.j2 \
  /usr/share/jupyter/nbconvert/templates/lab/conf.json \
  /usr/share/jupyter/nbconvert/templates/lab/static \
  /usr/share/jupyter/nbconvert/templates/lab/static/index.css \
  /usr/share/jupyter/nbconvert/templates/lab/static/theme-light.css \
  /usr/share/jupyter/nbconvert/templates/lab/static/theme-dark.css \
  /usr/share/jupyter/nbconvert/templates/script/script.j2 \
  /usr/share/jupyter/nbconvert/templates/script/conf.json \
  /usr/share/jupyter/nbconvert/templates/classic/base.html.j2 \
  /usr/share/jupyter/nbconvert/templates/classic/index.html.j2 \
  /usr/share/jupyter/nbconvert/templates/classic/conf.json \
  /usr/share/jupyter/nbconvert/templates/classic/static \
  /usr/share/jupyter/nbconvert/templates/classic/static/style.css \
  /usr/share/jupyter/nbconvert/templates/reveal/base.html.j2 \
  /usr/share/jupyter/nbconvert/templates/reveal/index.html.j2 \
  /usr/share/jupyter/nbconvert/templates/reveal/conf.json \
  /usr/share/jupyter/nbconvert/templates/reveal/cellslidedata.j2 \
  /usr/share/jupyter/nbconvert/templates/reveal/static \
  /usr/share/jupyter/nbconvert/templates/reveal/static/custom_reveal.css \
  /usr/share/jupyter/nbconvert/templates/rst/conf.json \
  /usr/share/jupyter/nbconvert/templates/rst/index.rst.j2 \
  /usr/share/jupyter/nbconvert/templates/python/index.py.j2 \
  /usr/share/jupyter/nbconvert/templates/python/conf.json \
"
