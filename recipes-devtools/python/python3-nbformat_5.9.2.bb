
SUMMARY = "The Jupyter Notebook format"
HOMEPAGE = "https://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

SRC_URI[sha256sum] = "5f98b5ba1997dff175e77e0c17d5c10a96eaed2cbd1de3533d1fc35d5e111192"

PYPI_PACKAGE = "nbformat"

DEPENDS += "\
    ${PYTHON_PN}-hatch-nodejs-version-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-fastjsonschema \
    ${PYTHON_PN}-jsonschema \
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-traitlets \
"


