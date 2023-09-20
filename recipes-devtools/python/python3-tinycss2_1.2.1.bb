
SUMMARY = "A tiny CSS parser"
HOMEPAGE = "https://www.courtbouillon.org/tinycss2"
AUTHOR = "None <Simon Sapin <simon.sapin@exyr.org>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d072d7e30e34f33f8ae956ada04fa2c"

SRC_URI[sha256sum] = "8cff3a8f066c2ec677c06dbc7b45619804a6938478d9d73c284b29d14ecb0627"

PYPI_PACKAGE = "tinycss2"

DEPENDS += "\
"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-webencodings \
"
