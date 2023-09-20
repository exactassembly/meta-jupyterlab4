
SUMMARY = "A client library for executing notebooks. Formerly nbconvert's ExecutePreprocessor."
HOMEPAGE = "https://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f188c37957b44d9adbe64cb1932895"

SRC_URI[sha256sum] = "f9b179cd4b2d7bca965f900a2ebf0db4a12ebff2f36a711cb66861e4ae158e55"

PYPI_PACKAGE = "nbclient"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-jupyter-client \
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-nbformat \
    ${PYTHON_PN}-traitlets \
"

