
SUMMARY = "A Python implementation of the JSON5 data format."
HOMEPAGE = "https://github.com/dpranke/pyjson5"
AUTHOR = "Dirk Pranke <dpranke@chromium.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

SRC_URI[sha256sum] = "9ed66c3a6ca3510a976a9ef9b8c0787de24802724ab1860bc0153c7fdd589b02"

PYPI_PACKAGE = "json5"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"